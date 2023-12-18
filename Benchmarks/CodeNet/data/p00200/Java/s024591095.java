
import java.io.*;
import java.security.acl.Group;
import java.util.*;

//@0200  Z¶êl· ~ÂtÌÐ¹ØÒ~
public class Main {

	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		for(int loop = 0;; loop++) {

			String s = reader.readLine();
			String[] sp = s.split(" ");
			int N = Integer.parseInt(sp[0]);
			int M = Integer.parseInt(sp[1]);
			if (N == 0)
				break;

			int[][] senros = new int[N][]; 
			
			for(int i = 0; i < N; i++) {
				s = reader.readLine();
				sp = s.split(" ");
				int a = Integer.parseInt(sp[0]);
				int b = Integer.parseInt(sp[1]);
				int cost = Integer.parseInt(sp[2]);
				int time = Integer.parseInt(sp[3]);
				
				int[] senro = new int[] { a, b, cost, time };
				senros[i] = senro;
			}
			
			s = reader.readLine();
			int k = Integer.parseInt(s);

			for(int toi = 0; toi < k; toi++) {
				// â¢í¹
				
				s = reader.readLine();
				sp = s.split(" ");
				int p = Integer.parseInt(sp[0]);
				int q = Integer.parseInt(sp[1]);
				int r = Integer.parseInt(sp[2]);

				int[] eki = new int[M];
				for(int i = 0; i < M; i++) {
					eki[i] = 999999999;
				}
				eki[p - 1] = 0; // X^[gw 
			
				for(;;) { // Àè·éÜÅ
					
					boolean isChange = false;
					
					for(int i = 0; i < N; i++) { // ·×ÄÌüHÉÂ¢Ä
						int[] senro = senros[i];
						int cost = senro[2 + r]; // àzorÔ
						if (eki[senro[0] - 1] > eki[senro[1] - 1] + cost) {
							eki[senro[0] - 1] = eki[senro[1] - 1] + cost;
							isChange = true;
						}
						if (eki[senro[1] - 1] > eki[senro[0] - 1] + cost) {
							eki[senro[1] - 1] = eki[senro[0] - 1] + cost;
							isChange = true;
						}
					}
					
					if (!isChange)
						break; // Àèµ½
				}
				
				System.out.printf("%d\n", eki[q-1]);
				
			}
		}		
		
		reader.close();
	}

}