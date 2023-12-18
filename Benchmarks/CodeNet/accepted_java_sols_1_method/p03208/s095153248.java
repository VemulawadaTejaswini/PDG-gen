import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  long[] a = new long[n];
  for(int i = 0;i < n;i++){
    long b = sc.nextLong();
    a[i] = b;
  }
  Arrays.sort(a);
  long min = 1000000000;
  for(int i = 0;i < n-k+1;i++){
    min = Math.min(min,a[i+k-1]-a[i]);
  }
  System.out.println(min);
}}
