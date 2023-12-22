import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder line = new StringBuilder(br.readLine());

    String[] input = line.toString().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    int c = Integer.parseInt(input[2]);

    if(a < b && b < c) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}

