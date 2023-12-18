import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();  //展望台の個数
    int m = sc.nextInt();  //異なる展望台同士を結ぶ道の本数
    long[] h = new long[n];  //展望台iの標高
    boolean[] f = new boolean[n];  //展望台の評価　true=良い false=悪い
    for(int i=0; i<n; i++){
      h[i] = sc.nextLong();
      f[i] = true;
    }
    for(int i=0; i<m; i++){
      int a = sc.nextInt()-1;  //展望台a
      int b = sc.nextInt()-1;  //展望台b
      if(h[a] == h[b]){
        f[a] = false;
        f[b] = false;
      }
      else if(h[a]<h[b]){
        f[a] = false;
      }
      else if(h[a]>h[b]){
        f[b] = false;
      }
    }
    
    int ans = 0;
    for(int i=0; i<n; i++){
      if(f[i] == true)     ans++;
    }
    
    System.out.println(ans);
    
  }
}