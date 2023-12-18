import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static int digitNumber(int a, int b){ 
    int sum = a + b;
    String sumString = Integer.toString(sum);
    int digit = sumString.length();
    return digit;
  }
  public static void main(String[] args) throws Exception {
    for(int i = 0; i < 200; i++) {
      // 入力をもらう
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line = br.readLine();
      String[] inputArray = line.split(" ");
      int sumofinput = digitNumber(Integer.parseInt(inputArray[0]),Integer.parseInt(inputArray[1]));
      System.out.println(sumofinput);
    }   
  }
}