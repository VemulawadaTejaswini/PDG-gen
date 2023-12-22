import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0;
    int[] array_a = new int[n];
    int[] array_b = new int[n];
    for(int i = 0; i < n; i++){
      array_a[i] = sc.nextInt();
      array_b[i] = sc.nextInt();
    }
    Arrays.sort(array_a);
    Arrays.sort(array_b);
    if(n % 2 == 1){
      answer = array_b[(n - 1) / 2] - array_a[(n - 1) / 2] + 1;
    } else {
      answer = (array_b[(n / 2)] + array_b[(n / 2) - 1]) - (array_a[(n / 2)] + array_a[(n / 2) - 1]) + 1;
    }
    System.out.println(answer);
  }
}