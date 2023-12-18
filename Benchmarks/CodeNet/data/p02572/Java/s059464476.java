import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    long[] a = new long[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextLong();
    }

    long base = 1000000007;
    long result = 0;

    for(int i =0; i<n; i++){
      for(int j=i+1; j<n; j++){
        long multi = (a[i] * a[j]) % base;
        
        result = (result + multi) % base;
      }
    }

    System.out.println(result);

    return;

  }
}

