// AOJ 1022
#include<iostream>
#include<string>
#include<map>
#include<algorithm>
#include<vector>
#define value first
#define p second
using namespace std;
typedef pair<int,int> result;

// {{{
const int OutOfIntExc = 1, NegIntExc = 2, NotEquationExc = 3,
      NotNumExc = 4, LackNumExc = 5, IterExceedExc = 6,
      IncorrectExc = 7;// }}}

//{{{ 
result equation(const string &s, int p = 0);
result expression(const string &s, int p = 0);
result factor(const string &s, int p = 0);
result term(const string &s, int p = 0);
// }}} 

result equation(const string &s, int p) { // {{{
  if (s[p] == '=') { throw NotEquationExc; }
  result r = expression(s, p);
  if (s[r.p] != '=') { throw NotEquationExc; }

  r.p++;
  result t = expression(s, r.p);
  t.value = (int)(r.value == t.value);

  return t;
} // }}} 

result expression(const string &s, int p) { // {{{
  result r = factor(s, p);
  while (s[r.p] == '+' or s[r.p] == '-') {
    result r_ = factor(s, r.p+1);
    r.value += (s[r.p] == '+' ? r_.value : - r_.value);
    if (r.value < 0) { throw NegIntExc; }
    r.p = r_.p;
  }
  return r;
} // }}}

result factor(const string &s, int p) { // {{{
  result r = term(s, p);
  while (s[r.p] == '*' or s[r.p] == '/') {
    result r_ = term(s, r.p+1);
    if (s[r.p] == '*') {
      r.value *= r_.value;
    } else {
      if (r_.value == 0 or r.value % r_.value != 0) {
        throw OutOfIntExc;
      }
      r.value /= r_.value;
    }
    r.p = r_.p;
  }
  return r;
} // }}}

result term(const string &s, int p) { // {{{
  if (not isdigit(s[p])) { throw LackNumExc; }
  int value = 0;
  bool flag = false;

  while (isdigit(s[p])) {
    if (flag and value == 0) { throw NotNumExc; }
    flag = true;
    value = value * 10 + (s[p++] - '0');
  }
  return result(value, p);
} // }}}

#define REP(i,n) for(int i=0;i<(int)(n);i++)
#define X first
#define Y second
int H, W, n;
const int HMAX = 200, WMAX = 200, NMAX = 200;
char table[HMAX][WMAX], block[NMAX];

typedef pair<int,int> P;
bool printed[HMAX][WMAX];
P blanks[NMAX];
bool  operand_not_allowed[NMAX];
vector<P> vbegins, hbegins;
P vsolvables[NMAX], hsolvables[NMAX];

void init() { // {{{
  vbegins.clear();
  hbegins.clear();

  REP(y, H) REP(x, W) {
    printed[x][y] = false;
  }

  REP(i, n) {
    operand_not_allowed[i] = false;
  }
} // }}}

string tostr(P x) {
  return "(" + to_string(x.first) + "," + to_string(x.second) + ")";
}

bool is_operand(char c) {
    return c == '=' or c == '+' or c == '-' or c == '*' or c == '/';
}

bool operand_connected(string str) {
  bool flag = true;
  for (int i = 0, len = str.size(); i < len; i++) {
    if (is_operand(str[i])) {
      if (flag) return true;
      flag = true;
    } else {
      flag = false;
    }
  }
  return false;
}

bool incorrect(string str) {
//  cout << "<" << str << ">" << endl;
  return !operand_connected(str) and equation(str).value != 1; 
}

bool legal(int x, int y) { // {{{
  return 0 <= x and x < W and 0 <= y and y < H;
} // }}}

bool legal(P p) { return legal(p.X, p.Y); }

bool is_white_block(int x, int y) {
  return legal(x, y) and table[x][y] != '#';
}

bool is_white_block(P p) {
  return is_white_block(p.X, p.Y);
}

string getv(int x, int y) { // {{{
  string str;
  while (legal(x, y) and table[x][y] != '#') {
    str.push_back(table[x][y]);
    y++;
  }
  return str;
} // }}}

string getv(P p) { return getv(p.X, p.Y) ; }

string geth(int x, int y) { // {{{
  string str;
  while (legal(x, y) and table[x][y] != '#') {
    str.push_back(table[x][y]);
    x++;
  }
  return str;
} // }}}

string geth(P p) { return geth(p.X, p.Y) ; }

bool taboo_operand() {
  REP(i, n) {
    if (operand_not_allowed[i] and is_operand(block[i]))
      return true;
  }
  return false;
}

bool solve() { // {{{
  sort(block, block + n);
  do {
    if (taboo_operand()) continue;
    try {
      REP(i, n) {
        P p = blanks[i];
        table[p.X][p.Y] = block[i];

        P q = vsolvables[i];
//        cout << '#' << i << tostr(q) << getv(q) << endl;
        if (legal(q) and incorrect(getv(q))) {
//          cout << "!" << getv(q.first, q.second) << endl;
          throw IncorrectExc;
        }

        q = hsolvables[i];
//        cout << '#' << i << tostr(q) << geth(q) << endl;
        if (legal(q) and incorrect(geth(q))) {
//          cout << "?" << geth(q.first, q.second) << endl;
          throw IncorrectExc;
        }
      }
      for (P begin : vbegins) {
        if (incorrect(getv(begin))) throw IncorrectExc;
      }
      for (P begin : hbegins) {
        if (incorrect(geth(begin))) throw IncorrectExc;
      }
      return true;
    } catch (int exc) {
      continue;
    }
  } while (next_permutation(block, block + n));
  return false;
} // }}}

P v_solvable(P p) { // {{{
  string v = getv(p.X, p.Y + 1);
//  cout << v << endl;
  if (v.find(".", 0) == string::npos and
      is_white_block(p.X, p.Y - 1)) {
    int x = p.X, y = p.Y;
    while (is_white_block(x,y)) y--;
    return P(x, ++y);
  } else {
    return P(-1, -1);
  }
} // }}}

P h_solvable(P p) { // {{{
  string h = geth(p.X + 1, p.Y);
  if (h.find(".", 0) == string::npos and
      is_white_block(p.X - 1, p.Y)) {
    int x = p.X, y = p.Y;
    while (is_white_block(x,y)) x--;
    return P(++x, y);
  } else {
    return P(-1, -1);
  }
} // }}}

bool nearby_operand(P p) {
  const int dx[4] = {0, 1, 0, -1}, dy[4] = {1, 0, -1, 0};
  REP(i, 4) {
    int nx = p.X + dx[i], ny = p.Y + dy[i];
    if (is_operand(table[nx][ny])) return true;
  }
  return false;
}

bool is_vbeginner(P p) {
  return is_white_block(p) and is_white_block(p.X, p.Y + 1)
    and !is_white_block(p.X, p.Y - 1);
}

bool is_hbeginner(P p) {
  return is_white_block(p) and is_white_block(p.X + 1, p.Y)
    and !is_white_block(p.X-1, p.Y);
}

int main() {
  while (cin >> H >> W and H + W) {
    REP(y, H) { // {{{
      string row;
      cin >> row;
      REP(x, W) {
        table[x][y] = row[x];
        printed[x][y] = row[x] != '.';
      }
    } // }}}

    for (int i = 0, x = 0; x < W; x++) for (int y = 0; y < H; y++) {
      if (table[x][y] == '.') {
        blanks[i] = P(x, y);
        i++;
      }
    }

    cin >> n;
    REP(i, n) { cin >> block[i]; }
    
    init();

    for (int i = 0; i < n; i++) {
      vsolvables[i] = v_solvable(blanks[i]);
      hsolvables[i] = h_solvable(blanks[i]);
//      cout << tostr(vsolvables[i]) << getv(vsolvables[i]) << endl;
//       cout << tostr(hsolvables[i]) << geth(hsolvables[i]) << endl;
      operand_not_allowed[i] = nearby_operand(blanks[i]);
    }

    REP(y,H) REP(x,W) {
      if (is_vbeginner(P(x,y))) { vbegins.push_back(P(x,y)); }
      if (is_hbeginner(P(x,y))) { hbegins.push_back(P(x,y)); }
    }

    cout << (solve() ? "Yes" : "No") << endl;
  }
}

// vim: set foldmethod=marker :