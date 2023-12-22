import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] L = new int[N];
        Arrays.fill(L, 0);
        int sum = 0;
        for(int i = 1; i < N; i++){
          int A = sc.nextInt();
          L[A-1] += 1;
        }
        for(int i = 0; i < N; i++){
          System.out.println(L[i]);
        }
      }
}
