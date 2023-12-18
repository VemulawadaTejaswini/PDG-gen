import java.util.Scanner;
import java.io.PrintWriter;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      int n = sc.nextInt();
      out.println((int)Math.pow(n,3.0));
      out.flush();
    }
}