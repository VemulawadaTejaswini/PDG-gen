public class Main {

  char[] c;
  int id;

  int exp() {
    int s = term();
    if (id < c.length && '0' <= c[id] && c[id] <= '9') {
      int t = term();
      int op = operand();
      return calc(s, t, op);
    }
    return s;
  }

  int term() {
    int s = number();
    if (id < c.length && '0' <= c[id] && c[id] <= '9') {
      int t = number();
      int op = operand();
      return calc(s, t, op);
    }
    return s;
  }

  int number() {
    int ret = 0;
    while (id < c.length && c[id] != ' ') {
      ret *= 10;
      ret += c[id] - '0';
      id++;
    }
    id++;
    return ret;
  }

  int operand() {
    int ret = c[id];
    id += 2;
    return ret;
  }

  int calc(int s, int t, int op) {
    if (op == '+') {
      return s + t;
    }
    if (op == '-') {
      return s - t;
    }
    if (op == '*') {
      return s * t;
    }
    return -1;
  }

  void run() {
    Scanner sc = new Scanner(System.in);

    c = sc.nextLine().toCharArray();
    // char[] d = "1 2 + 3 4 - *".toCharArray();
    id = 0;
    System.out.println(exp());
  }

  public static void main(String[] args) {
    new Main().run();
  }
}