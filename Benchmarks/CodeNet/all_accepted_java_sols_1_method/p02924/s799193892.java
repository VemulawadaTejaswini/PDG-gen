import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = (long)N * (N-1)/2;
    System.out.println( ans);

  }

}
