import java.util.*;
public class Main {
	public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int row = scan.nextInt();
      int col = scan.nextInt();
      int[][] matrix = new int[row][col];
      int[][]  pathCount = new int[row][col];
      for(int i=0; i<row; i++) {
    	char[] input = scan.next().toCharArray();
        for(int j=0; j<col; j++) {
          if(input[j]=='.') {
            matrix[i][j]=0;
          }else{
            matrix[i][j]=1;
          }
        }
      }
      for(int i=0; i<col; i++) {
        if(matrix[0][i]==0) {
          pathCount[0][i]=1;
        }else {
        	break;
        }
      }
      for(int i=0; i<row; i++) {
        if(matrix[i][0]==0) {
          pathCount[i][0]=1;
        }else {
        	break;
        }
      }
      int n = 1000000007;
      for(int i=1; i<row; i++) {
        for(int j=1; j<col; j++) {
          if(matrix[i][j]==1) 
          continue;
          pathCount[i][j]=(pathCount[i-1][j]+pathCount[i][j-1])%n;;
        }
      }
      System.out.println(pathCount[row-1][col-1]);
      scan.close();
    }
}