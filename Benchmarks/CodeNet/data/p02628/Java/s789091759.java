import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      int[] pn = new int[N];
      int result = 0;
      
      for(int i=0; i<N; i++){
        pn[i] = scan.nextInt();
      }
      Arrays.sort(pn);
      for(int i=0; i<K; i++)
        result += pn[i];
      System.out.println(result);
    }
}
