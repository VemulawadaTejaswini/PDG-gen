import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    long[] a = new long[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextLong();

      if(a[i] == 0){
        System.out.println(0);
        return;
      }
    }

    long result = a[0];
    long preResult = a[0];
    long upper = 1000000000000000000L;

    for(int i=1; i<n; i++){
      result = result * a[i];
      if(result < preResult || result > upper){
        System.out.println(-1);
        return;
      }
      preResult = result;
    }

    System.out.println(result);
  }
}