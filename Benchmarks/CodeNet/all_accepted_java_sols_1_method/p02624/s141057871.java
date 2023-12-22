import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int end = (int)Math.sqrt(n) + 1;
    int end = n / 2;
    int[] cntOfDivisors = new int[n + 1];
    Arrays.fill(cntOfDivisors, 2);
    cntOfDivisors[0] = 0;
    cntOfDivisors[1] = 1;
    for(int i = 2; i <= end; i++){
      int t = 2;
      while(i * t <= n){
        cntOfDivisors[i * t]++;
        t++;
      }
    }
    long answer = 0;
    for(int i = 1; i <= n; i++){
      answer += cntOfDivisors[i] * (long)i;
    }
    System.out.println(answer);
  }
}