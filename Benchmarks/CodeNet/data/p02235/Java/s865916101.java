import java.util.*;
import java.io.*;
class Main{
  static int q;
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    q = Integer.parseInt(br.readLine());
    // Scanner sc = new Scanner(System.in);
    // q = sc.nextInt();
    String s[] = new String[2];
    for(int i = 0; i<q; i++){
      s[0] = br.readLine();
      s[1] = br.readLine();
      System.out.println(LCSLength(s[0] , s[1]));
    }
  }


  static int LCSLength(String X, String Y){
    int m = X.length();
    int n = Y.length();
    int c[][] = new int[m+1][n+1];
    for(int i =0; i<=m; i++){
      c[i][0] = 0;
    }
    for(int j = 0; j<=n; j++){
      c[0][j] = 0;
    }

    for(int i = 1; i<=m; i++){
      for(int j = 1; j<=n; j++){
        if(X.charAt(i-1) == Y.charAt(j-1)){
          c[i][j] = c[i-1][j-1] +1;
        }else if(c[i -1][j] >=c[i][j-1]){
          c[i][j] = c[i-1][j];
        }else{
          c[i][j] = c[i][j-1];
        }
      }
    }
    return c[m][n];
  }

}
