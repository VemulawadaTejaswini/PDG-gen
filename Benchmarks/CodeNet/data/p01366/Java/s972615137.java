import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while(true) {
      int n = scan.nextInt();
      int m = scan.nextInt();
      if((n|m) == 0) return;
      Town[] towns = new Town[n];
      for(int i = 0; i < n; i++) towns[i] = new Town();
      List<List<Branch>> branches = new ArrayList<>(n);
      for(int i = 0; i < n; i++) branches.add(new ArrayList<Branch>());
      for(int i = 0; i < m; i++) {
          int u = scan.nextInt()-1;
          int v = scan.nextInt()-1;
          int d = scan.nextInt();
          int c = scan.nextInt();
          Branch _b1 = new Branch(u,v,d,c);
          Branch _b2 = new Branch(v,u,d,c);
          branches.get(u).add(_b1);
          branches.get(v).add(_b2);
      }
      TreeSet<Branch> set = new TreeSet<>();
      set.addAll(branches.get(0));
      int result = 0;
      int[] minLenArr = new int[n];
      while(!set.isEmpty()) {
/*
        for(Branch _b : set) {
          System.out.printf("[%d,%d,%d,%d]\n",_b.u,_b.v,_b.d,_b.c);
        }
*/
        Branch _b = set.pollFirst();
        Town t1 = towns[_b.u].getTown();
        Town t2 = towns[_b.v].getTown();
        if(t1==t2) continue;
        Town z0 = towns[0].getTown();
        int newTownIndex = _b.u;
        int oldTownIndex = _b.v;
        if(z0==t1) {
          newTownIndex = _b.v;
          oldTownIndex = _b.u;
        }
        Town nt = new Town();
        t1.parent = nt;
        t2.parent = nt;
        result += _b.c;
        minLenArr[newTownIndex] = _b.d;
        for(Branch bb : branches.get(newTownIndex)) {
          bb.d += minLenArr[newTownIndex];
        }
        //System.out.printf("(%d,%d)\n",newTownIndex,oldTownIndex);
        set.addAll(branches.get(newTownIndex));
      }
      System.out.println(result);
    }
  }
}

class Town{
  Town parent;
  Town(){}
  Town getTown() {
    return (parent==null)?this:parent.getTown();
  }
}

class Branch implements Comparable<Branch>{
  int u,v,d,c;
  Branch(int _u, int _v, int _d, int _c) {
    u = _u;
    v = _v;
    d = _d;
    c = _c;
  }
  @Override
  public int compareTo(Branch _b) {
    if(this==_b) return 0;
    if(this.d==_b.d) {
      if(this.c!=_b.c) return this.c-_b.c;
      return 1;
    }
    return this.d-_b.d;
  }
}