import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();

    long[] a = new long[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextLong();
    }

    for(int i=k; i< n; i++){
      if(a[i - k] >= a[i]){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
  }
}