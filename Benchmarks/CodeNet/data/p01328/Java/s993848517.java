
import java.io.*;
import java.security.acl.Group;
import java.util.*;

//@2211  Problem H: À¢LAÁ½
public class Main {

	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		for(;;) {
			List<int[]> cats = new ArrayList<int[]>();
		
			String s = reader.readLine();
			String[] sp = s.split(" ");
			int N = Integer.parseInt(sp[0]);
			int M = Integer.parseInt(sp[1]);
			if (N == 0 && M == 0)
				break;
			
			for(int i = 0; i < N; i++) {
				s = reader.readLine();
				sp = s.split(" ");
				int x = Integer.parseInt(sp[0]);
				int y = Integer.parseInt(sp[1]);
				int c = Integer.parseInt(sp[2]);
				int[] cat = new int[] { x, y, c };
				cats.add(cat);
			}
			
			int[] esa = new int[M];

			for(int i = 0; i < M; i++) {
				s = reader.readLine();
				esa[i] = Integer.parseInt(s);
			}
			Arrays.sort(esa);// ¸É\[g ¯¶£Èçxª¬³¢Ù¤ÈÌÅ

			int mm = Integer.MAX_VALUE;// ÅåË±ÌÅ¬
			
			for(int i = 1/*0Í­*/; i < (1 << M); i++) {
				
				int[] esaCat = new int[M]; // ¦³²ÆÌË±
				
				for(int j = 0; j < N; j++) { // Ë±ÉÂ¢Ä¦³ðè·é
					
					int[] cat = cats.get(j); 
					int min = Integer.MAX_VALUE;
					int minEsa = -1;
					
					// ÅZÌ¦³Î±
					for(int k = 0; k < M; k++) {
						if ((i & (1 << k)) == 0) // ¦³Èµ
							continue;
//						int len = (cat[0] - esa[k]) * (cat[0] - esa[k]) + cat[1] * cat[1];
						int len = Math.abs(cat[0] - esa[k]);
						if (len < min) {
							min = len;
							minEsa = k;
						}
					}
					esaCat[minEsa] += cat[2]; // »±Ö¢­
				}
				Arrays.sort(esaCat);
				int max = esaCat[M - 1]; // ÅåË±
				mm = Math.min(mm, max);  // ÌÅ¬l
			}
			System.out.printf("%d\n", mm);
		}		
		
		reader.close();
	}

}