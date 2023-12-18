import java.util.*;

class Main{
  static int []pre, in , post;
  static int n, pos,count;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    int k;
    pre = new int[n];
    in = new int[n];
    post = new int[n];
    for(int i =0; i<n; i++){
      k = sc.nextInt();
      pre[i] = k;
    }

    for(int i = 0; i<n; i++){
      k = sc.nextInt();
      in[i] = k;
    }
    solve();
  }

  static void rec( int l, int r){
    if( l >= r)return;
    int root = pre[pos++];
    int m=0;
    while(in[m] != root)m++;
    rec(l,m);
    rec(m+1,r);
    post[count++] = root;
  }

  static void solve(){
    pos = 0;
    rec(0, n);
    StringBuilder bl = new StringBuilder();
    for (int i = 0; i < n-1; i++) {
      bl.append(post[i]);
      bl.append(" ");
    }
    bl.append(post[n-1]);
    bl.append("\n");
    System.out.print(bl);
  }
}
