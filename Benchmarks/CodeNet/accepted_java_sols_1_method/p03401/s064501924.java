import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] a = new int[N];
  for(int i = 0;i < N;i++){
    a[i] = sc.nextInt();
  }
int sum = (int)Math.abs(a[0]) + (int)Math.abs(a[N-1]);
for(int i = 1;i < N;i++){
  sum += (int)Math.abs(a[i] - a[i-1]);
}
System.out.println(sum - (int)Math.abs(a[1]-a[0]) - (int)Math.abs(a[0]) + (int)Math.abs(a[1]));
for(int i = 1;i < N-1;i++){
  System.out.println(sum - (int)Math.abs(a[i]-a[i-1]) - (int)Math.abs(a[i+1]-a[i]) + (int)Math.abs(a[i+1] - a[i-1]));
}
System.out.println(sum - (int)Math.abs(a[N-1]-a[N-2]) - (int)Math.abs(a[N-1]) + (int)Math.abs(a[N-2]));
}}

