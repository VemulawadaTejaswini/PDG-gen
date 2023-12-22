
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] hillHeights = new int[10];
    //Input.
    for (int i = 0; i < 10; i++)
      hillHeights[i] = Integer.parseInt(reader.readLine());
    
    //Sort.
    Arrays.sort(hillHeights);

    //Output.
    for (int i = 0; i < 3; i++)
      System.out.println(hillHeights[hillHeights.length - i - 1]);

  }

}