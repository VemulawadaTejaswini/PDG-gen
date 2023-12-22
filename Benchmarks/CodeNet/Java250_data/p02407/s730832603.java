import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int length = Integer.parseInt(reader.readLine());
    
    String[] intAryStr = reader.readLine().split(" ");
    int[] intAry = new int[intAryStr.length];
    for (int i = 0; i < intAry.length; i++)
      intAry[i] = Integer.parseInt(intAryStr[i]);
    
    reverse(intAry);

    for (int i = 0; i < intAry.length; i++)
      if (i == intAry.length-1)
        System.out.println(intAry[i]);
      else
        System.out.print(intAry[i] + " ");
  }

  public static void reverse(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int tmp = array[i];
      array[i] = array[array.length-1-i];
      array[array.length-1-i] = tmp;
    }
  }
  
}