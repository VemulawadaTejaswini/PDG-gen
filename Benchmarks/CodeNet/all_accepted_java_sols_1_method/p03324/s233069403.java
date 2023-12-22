import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    int num = 0;
    if (D == 0) {
      num = 1;
    } else if (D == 1) {
      num = 100;
    } else if (D == 2) {
      num = 10000;
    }
    if (N == 100) {
      if (D== 0) {
        System.out.println(num * N + 1);  
      } else if (D == 1) {
        System.out.println(num * N + 100); 
      } else if (D == 2) {
        System.out.println(num * N + 10000); 
      }
    } else {
      System.out.println(num * N);
    }
  }
}