import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] array = new String[2];
    int[] numbers = new int[2];
    String inputStr;
    StringBuilder sb = new StringBuilder();
    while(true) {
      inputStr = br.readLine();
      array = inputStr.split(" ");
      numbers[0] = Integer.parseInt(array[0]);
      numbers[1] = Integer.parseInt(array[1]);
      if (numbers[0] == 0 && numbers[1] == 0) {
        break;
      }
      else {
        if (numbers[0] < numbers[1]) {
          sb.append(Integer.toString(numbers[0])).append(" ").append(Integer.toString(numbers[1])).append("\n");
        }
        else {
          sb.append(Integer.toString(numbers[1])).append(" ").append(Integer.toString(numbers[0])).append("\n");
        }
      }
    }
    sb.delete(sb.length() - 1, sb.length());
    System.out.println(sb);
  }
}