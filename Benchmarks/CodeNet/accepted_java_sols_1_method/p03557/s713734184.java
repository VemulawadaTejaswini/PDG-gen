import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] a = new int[N];
  int[] b = new int[N];
  int[] c = new int[N];
  for(int i=0; i<N; i++) a[i] = sc.nextInt();
  for(int i=0; i<N; i++) b[i] = sc.nextInt();
  for(int i=0; i<N; i++) c[i] = sc.nextInt();	
  Arrays.sort(a);
  Arrays.sort(b);
  Arrays.sort(c);
  long[] dpb = new long[N];
  int ci = 0;
  for(int i=0; i<N; i++){
    while(ci<N && b[i]>=c[ci]) ci++;
    dpb[i] = N-ci;
  }
  for(int i=N-2; i>=0; i--){
    dpb[i] = dpb[i]+dpb[i+1];
  }
  int bi = 0;
  long ans = 0;
  for(int i=0; i<N; i++){
    while(bi<N && a[i]>=b[bi]) bi++;
    if(bi>=N) break;
    ans += dpb[bi];
  }
  System.out.println(ans);
}}