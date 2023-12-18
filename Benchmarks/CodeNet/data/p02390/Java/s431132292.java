import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // input keybord
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    
    // for output
    StringBuilder output = new StringBuilder();

    // hour
    int calcRes = input / 3600;
    output.append(calcRes + ":");
    
    // minitues
    input %= 3600;
    calcRes = input/60;
    output.append(calcRes + ":");
    
    // second
    input %= 60;
    output.append(input);

    System.out.println(output);
  }
}