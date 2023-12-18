import java.util.Scanner;
class Main{
  public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int ans = 0;

      String[] sa;
      String inputa = sc.next();
      sa = inputa.split("");
      int lena = sa.length;

      String[] sb;
      String inputb = sc.next();
      sb = inputb.split("");
      int lenb = sb.length;

      int[][] DP;
      DP = new int[lena+1][lenb+1];

      for(int i=0; i<=lena; i++){
        for(int j=0; j<=lenb; j++){
          DP[i][j] = 0;
        }
      }

      for(int i=0; i <= lena; i++){
          DP[i][0] = i;
      }

      for(int i=0; i <= lenb; i++){
         DP[0][i] = i;
      }

      for(int i=1; i<=lena; i++){
        for(int j=1; j<=lenb; j++){
          if(sb[j-1].equals(sa[i-1])){
              DP[i][j] = DP[i-1][j-1];
          }
          else{
              int m = Math.min(DP[i][j-1],DP[i-1][j]);
              DP[i][j] = Math.min(m,DP[i-1][j-1])+1;
          }
        }
      }
      ans = DP[lena][lenb];

      System.out.println(ans);
    }
}

