import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(), m = in.nextInt();
      int ans = (n*n-n+m*m-m)/2;
      System.out.println(ans);
    }
}