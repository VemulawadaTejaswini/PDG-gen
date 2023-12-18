import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long T = sc.nextLong();
  long sum = T;
  long[] a = new long[N];
  for(int i = 0;i < N;i++){
    a[i] = sc.nextLong();
  }
  for(int i = 0;i < N-1;i++){
    if(a[i+1] - a[i] >= T)sum += T;
    else sum += a[i+1] - a[i];
  }
  System.out.println(sum);
}}