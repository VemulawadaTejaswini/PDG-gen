import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    String[] sX = null;
    String[] sY = null;
    String[] sZ;
    int[][] LCS = null;
    String temp;
    int q;
    
    Scanner sc = new Scanner(System.in);
    q = sc.nextInt();
    int[] ans = new int[q];
    sc.nextLine();
    
    for(int i = 0; i < q; i++){
      temp = sc.nextLine() + " ";
      sX = temp.split("");
      temp = sc.nextLine() + " ";
      sY = temp.split("");
      
      LCS = new int[sX.length+1][sY.length+1];
      
      for(int k = 0; k <= sX.length; k++){
        for(int j = 0; j <= sY.length; j++){
          if(j == 0 || k == 0){
            LCS[k][j] = 0;
          }
          else if(sX[k-1].equals(sY[j-1])){
            LCS[k][j] = 1 + LCS[k-1][j-1];
          }
          else{
            LCS[k][j] = Math.max(LCS[k-1][j],LCS[k][j-1]);
          }
        }
      }
      ans[i] = LCS[sX.length-1][sY.length-1];
    }
    
    for(int i = 0; i < ans.length; i++){
      System.out.println(ans[i]);
    }
  }
}
