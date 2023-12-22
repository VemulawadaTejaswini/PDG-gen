import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String srgs[]) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(reader.readLine());
			String[] str = reader.readLine().split(" ");
			int[] H = new int[N+1];
			H[0] = Integer.parseInt(str[0]);
			int j = 0;
			int tmpcount = 0;
			int maxcount = 0;
			for(int i=1;i<N+1;i++) {
				if(i==N) {
					H[i] = H[i-1] + 1;
				}else {
					H[i] = Integer.parseInt(str[i]);					
				}
				if(H[i]>H[i-1]) {
					tmpcount = i - j - 1;
					if(tmpcount > maxcount) {
						maxcount = tmpcount;
					}
					j = i;
				}
				
			}
									
			System.out.println(maxcount);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
