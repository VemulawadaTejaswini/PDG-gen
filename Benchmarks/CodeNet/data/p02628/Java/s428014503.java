import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();
       int cnt = 0;
       int[] p = new int[N];
       for(int i=0; i<N; i++){
         p[i] = sc.nextInt(N);
       }
       Arrays.sort(p);
       for(int i=0; i<K; i++){
         cnt += p[i];
       }
    System.out.println(cnt);
   }
}