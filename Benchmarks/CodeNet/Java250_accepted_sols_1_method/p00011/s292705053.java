
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    
    int numOfVertialLine = Integer.parseInt(reader.readLine());
    int[] verticalLines = new int[numOfVertialLine];
    for (int i = 1; i <= verticalLines.length; i++)
      verticalLines[i-1] = i;
    
    int numOfChange = Integer.parseInt(reader.readLine());
    for (int i = 0; i < numOfChange; i++) {
      String[] changeStr = reader.readLine().split(",");
      int from = Integer.parseInt(changeStr[0]);
      int to = Integer.parseInt(changeStr[1]);
      int from_stack = verticalLines[from-1];
      verticalLines[from-1] = verticalLines[to-1];
      verticalLines[to-1] = from_stack;
    }
    
    for (int n : verticalLines)
      System.out.println(n);
    
  }

}