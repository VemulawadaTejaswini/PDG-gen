import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0;
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int amax = a[n-1];
    boolean[] isNotPrime = new boolean[amax + 1];
    Arrays.fill(isNotPrime, true);
    for(int i = 0; i < n; i++){
      int div = a[i];
      if(i > 0 && a[i-1] == div) {
        isNotPrime[div] = false;
        continue;
      }
      for(int j = 2; j * div <= amax; j++){
        isNotPrime[j * div] = false;
      }
    }
    for(int i = 0; i < n; i++){
      if(isNotPrime[a[i]] == true) answer++;
    }
    System.out.println(answer);
  }
}