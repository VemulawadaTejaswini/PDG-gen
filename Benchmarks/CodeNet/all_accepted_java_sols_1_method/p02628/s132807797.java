import java.util.*;

public class Main {
 
	public static void main(String[] args) {
      Scanner sr = new Scanner(System.in);
      int N = sr.nextInt();
      int K = sr.nextInt();
      int p[] = new int[N];
      for(int i = 0;i<N;i++)
        p[i] = sr.nextInt();
      Arrays.sort(p);
      int sum = 0;
      for(int j = 0;j<K;j++)
        sum+=p[j];
      System.out.print(sum);
      
	}
}