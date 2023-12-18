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
    
    //カードの枚数
    String line = in.readLine();
    int N = Integer.parseInt(line);	
    
    //i 枚目のカードの数字
    line = in.readLine();
    String[] aArrayStr = line.split(" ");	
   
    Integer[] aArray = new Integer[N];
    for (int i = 0; i < N; i++) {
    	aArray[i] = Integer.parseInt(aArrayStr[i]);	
    }
    
    Arrays.sort(aArray, Collections.reverseOrder());
    
    int alice = 0;
    int bob = 0;
    
    Arrays.sort(aArray, Collections.reverseOrder());
    
    for (int i = 0; i < N; i++) {
    	if (i % 2 == 0) {
    		alice += aArray[i];
    	} else {
    		bob += aArray[i];
    	}
    	
    }
    
    System.out.println(alice - bob);
    
  }
}