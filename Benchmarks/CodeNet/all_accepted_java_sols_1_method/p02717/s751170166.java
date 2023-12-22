import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String   input   = reader.readLine();
    String[] numbers = input.split(" ");
    System.out.println(numbers[2] +" "+ numbers[0] +" "+ numbers[1]);
  }
}