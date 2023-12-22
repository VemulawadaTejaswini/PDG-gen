import java.util.Scanner;
class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] ans = new int[n];

    for(int z = 0; z < n; z++){
      String[] sa;
      String inputa = sc.next();
      sa = inputa.split("");
      int lena = sa.length;

      String[] sb;
      String inputb = sc.next();
      sb = inputb.split("");
      int lenb = sb.length;

      int[][] DP;
      DP = new int[lena][lenb];

      for(int i=0; i<lena; i++){
        for(int j=0; j<lenb; j++){
          DP[i][j] = 0;
        }
      }

      for(int i=0; i < lena; i++){
        if(sa[i].equals(sb[0])){
            for(int j = i; j < lena; j++){
              DP[j][0] = 1;
            }
            break;
        }
      }

      for(int i=0; i < lenb; i++){
        if(sb[i].equals(sa[0])){
            for(int j=i; j < lenb; j++){
              DP[0][j] = 1;
            }
            break;
        }
      }

      for(int i=1; i<lena; i++){
        for(int j=1; j<lenb; j++){
          if(sb[j].equals(sa[i])){
              DP[i][j] = DP[i-1][j-1]+1;
          }
          else if(DP[i-1][j] > DP[i][j-1]){
              DP[i][j] = DP[i-1][j];
          }
          else{
              DP[i][j] = DP[i][j-1];
          }
        }
      }
      ans[z] = DP[lena-1][lenb-1];
    }
    for(int z = 0; z < n; z++){
      System.out.println(ans[z]);
    }
  }
}

