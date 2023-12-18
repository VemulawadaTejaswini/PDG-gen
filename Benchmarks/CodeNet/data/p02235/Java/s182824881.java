import java.io.*;
import java.util.*;

class Main{
  static int n = 1000;
  static int[] A = new int[n];

  public static void main(String[] args){
    int j = 0;
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();

    for(int i=0 ; i<q ; i++){
      String S1 = scan.next();
      String S2 = scan.next();
      A[j] = lcs(S1, S2);
      j++;
    }
    for(int i=0 ; i<j ; i++){
      System.out.println(A[i]);
    }
  }

  static int lcs(String S1, String S2){
    int ans = 0;
    int maxl = 0;
    int a[][] = new int[n+1][n+1];
    int sl1 = S1.length();
    int sl2 = S2.length();

    for(int i=1 ; i<=sl1 ; i++){
      for(int j=1 ; j<=sl2 ; j++){
        String str1 = String.valueOf(S1.charAt(i-1));
        String str2 = String.valueOf(S2.charAt(j-1));

        if(str1.equals(str2)){
          a[i][j] = a[i-1][j-1] + 1;
        }
        else{
          if(a[i-1][j] >= a[i][j-1]){
            a[i][j] = a[i-1][j];
          }
          else{
            a[i][j] = a[i][j-1];
          }
        }

        if(maxl >= a[i][j]){
          ans = maxl;
        }
        else{
          ans = a[i][j];
        }

      }
    }
    return ans;
  }

}

