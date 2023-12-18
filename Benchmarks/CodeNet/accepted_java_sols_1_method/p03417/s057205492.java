import java.lang.Math;
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextInt();
    long m = scanner.nextInt();
    long N = (n == 1) ? 1 : n - 2;
    long M = (m == 1) ? 1 : m - 2;

    System.out.println(N * M);
  }
}