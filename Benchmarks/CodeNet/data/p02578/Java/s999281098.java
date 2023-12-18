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

    long total = 0;
    long min = a[0];
    for(int i=1; i<n; i++){
      if(a[i] >= min){
        min = a[i];
      }else{
        total += min - a[i];
      }
    }

    System.out.println(total);

    return;

  }
}