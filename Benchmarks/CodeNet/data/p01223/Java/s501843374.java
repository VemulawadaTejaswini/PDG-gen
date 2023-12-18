
import java.io.*;
import java.util.Arrays;

public class Main {

	//@2100
	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		//f[^
		int n = Integer.parseInt(r.readLine());
		
		for(int loop = 0; loop < n; loop++) {
			r.readLine();
			String s2 = r.readLine();
			String[] sp = s2.split(" ");
			int[] data = new int[sp.length];
			for(int i = 0; i < data.length; i++) {
				data[i] = Integer.parseInt(sp[i]);
			}			
			
			int up = 0;
			int down = 0;
			
			for(int i = 0; i < data.length - 1; i++) {
				if (data[i + 1] - data[i] > up) {
					up = data[i + 1] - data[i];
				}
				if (-(data[i + 1] - data[i]) > down) {
					down = -(data[i + 1] - data[i]);
				}
				
			}
			
//			for(int i = 0; i < a.length; i++) {
//				if (i != 0) 
//					System.out.printf(" ");
//				System.out.printf("%s", a[a.length - i - 1]);
//			}
//			System.out.printf("\n");
			System.out.printf("%d %d\n", up, down);
		}
	}
}