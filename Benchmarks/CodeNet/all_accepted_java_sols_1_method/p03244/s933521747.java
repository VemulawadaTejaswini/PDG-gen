import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] d1 = new int[100010];
    int[] d2 = new int[100010];
    int n = sc.nextInt();
    
    int res = 0;
    if( n>2 ){
      for(int i=0;i<n;i++){
        int v = sc.nextInt();
        if( ( i & ((int)1)) == 0 ){
          d1[v] ++;
        } else {
          d2[v] ++;
        }
      }
      int m11=0,m12=0,m21=0,m22=0;
      for(int i=1;i<=100000;i++){
        if( d1[i]>d1[m11] ){
          m12 = m11;
          m11 = i;
        } else if( d1[i]>d1[m12] ){
          m12 = i;
        }
        if( d2[i]>d2[m21] ){
          m22 = m21;
          m21 = i;
        } else if( d2[i]>d2[m22] ){
          m22 = i;
        }
      }
      if( m11 != m21 ){
        res = n - d1[m11] - d2[m21];
      } else {
        res = Math.min( n - d1[m12] - d2[m21] , n - d1[m11] - d2[m22] );
      }
    }
    System.out.println(res);
  }
}
