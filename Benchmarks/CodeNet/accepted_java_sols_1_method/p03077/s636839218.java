import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long[] a = new long[6];
    int index = 0;
    long min = Long.MAX_VALUE;
    for(int i = 1; i <= 5; i++){
      a[i] = sc.nextLong();
      if(min > a[i]){
        min = a[i];
        index = i;
      }
    }
    System.out.println((long)(Math.ceil(n / (double)min)) + 4);
  }
}