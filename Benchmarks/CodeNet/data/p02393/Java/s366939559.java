import java.io.*;
import java.util.Arrays;
   
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    inputs = Arrays.toString(inputs);
    System.out.println(String.join(" ", inputs));
  }
}