import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      
      int a = 0;
      int N = sc.nextInt();
      int K = sc.nextInt();
      int p[] = new int[N];
      for(int i = 0; i < N; i++){
        p[i] = sc.nextInt();
      }
      Arrays.sort(p);
      for(int i=0; i<K; i++){
        a+=p[i];
      }
      
      System.out.println(a);   
    }
}