import java.util.*;

public class Main{
  public static int lcs(String s, String ss){
    int m = s.length()+1;
    int n = ss.length()+1;
    int[][] c = new int[m][n];
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (s.charAt(i - 1) == ss.charAt(j - 1)){
          c[i][j] = c[i-1][j-1] + 1;
        }else{
          c[i][j] = Math.max(c[i][j-1], c[i-1][j]);
        }
      }
    }
    return c[m-1][n-1];
  }           
  public static void main (String args[]){       
    Scanner in = new Scanner(System.in);
    int pair = in.nextInt();
    int [] res = new int[pair];
    for (int i = 0; i < pair; i++){
      String s1 = in.next();
      String s2 = in.next();
      res[i] = (lcs(s1,s2));
    }
    for (int j = 0; j < res.length; j++){
      System.out.println(res[j]);
    }
  }
}
