import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    int[] array = {64, 32, 16, 8, 4, 2, 1};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < array.length; i++) {
      if (num >= array[i]) {
        System.out.println(array[i]);
        break;
      }
    }
  }

}
