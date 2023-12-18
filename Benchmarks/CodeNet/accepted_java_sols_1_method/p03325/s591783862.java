import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] numbers = new int[N];
    int count = 0;
    for (int i = 0; i < N; i++) {
      numbers[i] = sc.nextInt();
      while (numbers[i] % 2 == 0) {
        numbers[i] /= 2;
        count++;
      }
 
    }
    System.out.println(count);
  }
}