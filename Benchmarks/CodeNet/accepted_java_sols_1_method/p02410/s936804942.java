import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String[] inputRowAndCol = (input.readLine()).split("\\s");
    int x = Integer.parseInt(inputRowAndCol[0]);
    int y = Integer.parseInt(inputRowAndCol[1]);

 
    int[][] a = new int[x][y];
    String[] b = null; 
    
    for (int i = 0; i < x; i++) {
     
      b = (input.readLine()).split("\\s");
     
      for (int j = 0; j < y; j++) {
        
       a[i][j] = Integer.parseInt(b[j]);
      }
    }
   
    int[] vectorB = new int[y];
    for (int k = 0; k < y; k++) {
      vectorB[k] = Integer.parseInt(input.readLine());
    }

    for (int l = 0; l < x; l++) {
      int result = 0; 
    
      for (int m = 0; m < y; m++) {
       
        result += (a[l][m] * vectorB[m]);
      }
      
      System.out.println(result);
    }
  }
}
