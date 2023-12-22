import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
        int ans = 0;
        int suko[] = new int[M];
        for (int i=0;i<M;i++){
          suko[i] = 0;
        }
      
        for (int i=0;i<N;i++){
          int K = Integer.parseInt(sc.next());
          for (int j=0;j<K;j++){
            int A = Integer.parseInt(sc.next());
            suko[A-1] += 1;
          }
        }
        for (int i=0;i<M;i++){
          if (suko[i] == N){
            ans += 1;
          }
        }
     out.println(ans);
     out.flush();
    }
}