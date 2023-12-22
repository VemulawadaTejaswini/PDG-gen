import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] array = in.readLine().split("");
    System.out.println(array[2].equals(array[3]) 
                       && array[4].equals(array[5])?"Yes":"No");
  }
}