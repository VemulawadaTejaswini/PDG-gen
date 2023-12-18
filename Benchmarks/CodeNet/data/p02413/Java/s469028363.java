/* ITP1_7_C */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      String[] input = br.readLine().split(" ");
      int row = Integer.parseInt(input[0]);
      int column = Integer.parseInt(input[1]);
      int[][] matrix = new int[row + 1][column + 1];
      int all_sum = 0;

      // input & row sum
      for(int i = 0; i < row; i++){
        input = br.readLine().split(" ");
        for(int j = 0; j < column; j++){
          matrix[i][j] = Integer.parseInt(input[j]);
          matrix[i][column] += matrix[i][j];
          all_sum += matrix[i][j];
        }
      }
      // column sum
      for(int j = 0; j < column; j++){
        for(int i = 0; i < row; i++){
          matrix[row][j] += matrix[i][j];
        }
      }
      matrix[row][column] = all_sum;

      // output
      for(int i = 0; i < (row+1); i++){
        for(int j = 0; j < (column+1); j++){
          if(j != 0) sb.append(" ");
          sb.append(matrix[i][j]);
        }
        sb.append("\n");
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}