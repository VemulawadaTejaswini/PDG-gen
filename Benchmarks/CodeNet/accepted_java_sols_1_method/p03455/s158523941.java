import java.io.*;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] strIn = in.readLine().split("\\s");

    if ((Integer.parseInt(strIn[0])*Integer.parseInt(strIn[1]))%2 == 0)
      System.out.println("Even");

    else
      System.out.println("Odd");
  }
}
