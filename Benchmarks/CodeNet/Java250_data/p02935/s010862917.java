import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] a = new int[N];
      for(int i = 0; i < N; i++) {
        a[i] = sc.nextInt();
      }
      Arrays.sort(a);
      double output = a[0];
      for(int i = 1 ; i < N ; i++) {
      	output = (double)((output + (double) a[i]) / 2);
      }
      System.out.println(output);
      
    }
}