import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  /**
   * main method.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    
    //グリッド
    int[][] grid = new int[3][3];
    for (int i = 0; i < 3; i++) {
    	String line = in.readLine();
    	for (int j = 0; j < 3; j++) {
    		String[] line_char = line.split(" ");
    		grid[i][j] = Integer.parseInt(line_char[j]);	
        }
    }
    
    //正しい場合はtrue
    boolean trueFlag = true;
    
    for (int i = 1; i < 3; i++) {
    	for (int j = 0; j < 2; j++) {
    		if (grid[i][j] - grid[i-1][j] != grid[i][j+1] - grid[i-1][j+1]) {
    			trueFlag = false;
    		}
        }
    }
    
    if (trueFlag) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
    
  }
}