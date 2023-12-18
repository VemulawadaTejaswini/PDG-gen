import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String[] NMin = br.readLine().split(" ");
		int N = Integer.parseInt(NMin[0]);
		int M = Integer.parseInt(NMin[1]);
		
		long[][] Axy = new long[N][2];
		long[][] Cxy = new long[M][2];
		
		for(int Nin=0; Nin<N; Nin++){
			String[] Nxy = br.readLine().split(" ");
			Axy[Nin][0] = Long.parseLong(Nxy[0]);
			Axy[Nin][1] = Long.parseLong(Nxy[1]);
		}
		for(int Min=0; Min<M; Min++){
			String[] Mxy = br.readLine().split(" ");
			Cxy[Min][0] = Long.parseLong(Mxy[0]);
			Cxy[Min][1] = Long.parseLong(Mxy[1]);
		}
		
		int[] ans =new int[N];
		
		for(int n=0; n<N; n++){
			long Max = 1000000000;
			int near = 0;
			for(int m=0; m<M; m++){
				long man = Math.abs(Axy[n][0]-Cxy[m][0])+Math.abs(Axy[n][1]-Cxy[m][1]);
				if(man<Max){
					Max = man;
					near = m+1;
				}
			}
			ans[n]=near;
		}
		    
		for(int a=0; a<N; a++){
		    System.out.println(ans[a]);
		}
	}
}
