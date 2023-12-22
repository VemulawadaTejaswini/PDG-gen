import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    long[] a = new long[n];
    long[] plus = new long[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextLong();
    }

    plus[n- 2] = a[n - 1];

    long base = 1000000007;

    for(int i=n - 3; i >= 0; i--){
      plus[i] += (a[i+1] + plus[i+1]) % base;
    }

    long result = 0;

    for(int i=0; i<n - 1; i++){

      result += ((plus[i] * a[i]));
      result = result % base;
    }

    System.out.println(result);

    return;

  }
}
