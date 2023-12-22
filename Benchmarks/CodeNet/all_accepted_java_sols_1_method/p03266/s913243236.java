import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int count =0;
    if (K % 2 ==0) {
      System.out.print((long)Math.pow((N / (K/2) - N/K),3) + (long)Math.pow(N / K,3));
      } else {
      System.out.print((long)Math.pow(N / K ,3));
    }
  }
}