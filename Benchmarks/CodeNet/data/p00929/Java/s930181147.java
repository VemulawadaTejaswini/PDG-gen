#include<iostream>
#include<vector>
#include<utility>
#include<algorithm>
using namespace std;
struct UnionFind {
  int *data;
  UnionFind(int *_data, int size, bool reset = true) : data(_data) {
    if(reset) for(int i = 0; i < size; i++) data[i] = -1;
  }
  bool unionSet(int x, int y) {
    x = find(x); y = find(y);
    if (x != y) {
      if (data[y] < data[x]) std::swap(x, y);
      data[x] += data[y]; data[y] = x;
    }
    return x != y;
  }
  int find(int x) {
    return data[x] < 0 ? x : data[x] = find(data[x]);
  }
  int size(int x) {
    return -data[find(x)];
  }
};
int main(int argc, char *argv[])
{
  // kruskal with x being unused.
  // assumption: es is sorted
  auto kruskal = [](int n, const vector<pair<int,pair<int,int>>> &es, int *ufdata, int st) {
    UnionFind uf(ufdata, n, false);
    int sum = 0;
    for(int i = st; i < es.size(); i++) {
      const int u = es[i].second.first;
      const int v = es[i].second.second;
      if(uf.find(u) != uf.find(v)) {
        uf.unionSet(u, v);
        sum += es[i].first;
      }
    }
    return sum;
  };
  int n, m;
  vector<pair<int,pair<int,int>>> es;
  //cin >> n >> m;
  scanf("%d %d", &n, &m);
  for(int i = 0; i < m; i++) {
    int s, d, c;
    scanf("%d %d %d", &s, &d, &c);
    // cin >> s >> d >> c;
    es.push_back(make_pair(c, make_pair(s-1, d-1)));
  }
  sort(es.begin(), es.end());
  int mn = -1;
  int sum = 0;
  int cnt = 0;
  vector<int> ufdata(n);
  UnionFind uf(&(ufdata[0]), n);
  {
    vector<int> ufdata2(n);
    for(int j = 0; j < n; j++) ufdata2[j] = ufdata[j];
    mn = kruskal(n, es, &(ufdata2[0]), 0);
  }
  int ksum = 0;
  for(int i = 0; i < m; i++) {
    vector<int> ufdata2(n);
    for(int j = 0; j < n; j++) ufdata2[j] = ufdata[j];
    int mni = ksum + kruskal(n, es, &(ufdata2[0]), i+1);
    if(mni != mn) {
      cnt ++;
      sum += es[i].first;
    }
    const int u = es[i].second.first;
    const int v = es[i].second.second;
    if(uf.find(u) != uf.find(v)) {
      uf.unionSet(u, v);
      ksum += es[i].first;
    }
  }
  cout << cnt << " " << sum << endl;
  return 0;
}


