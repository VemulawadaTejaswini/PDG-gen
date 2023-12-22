import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i =0;
    int[] b = new int[32];
    if (N == 0) {
      System.out.print(0);
      return;
    }
    while (N != 0) {
      if (N % 2 != 0) {
        b[i] = 1;               
        N--;
      } else {
        b[i] = 0;
      }
      N /= -2;
      i++;
    } 
    i--;
    for (; i >=0; i--) {
      System.out.print(b[i]);
    }
  }
}