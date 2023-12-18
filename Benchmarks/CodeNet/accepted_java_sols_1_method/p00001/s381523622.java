
import java.io.*;
import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		int[] a = new int[10];
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 10; i++) {
			String s = r.readLine();
			a[i] = Integer.parseInt(s);
		}
		
		Arrays.sort(a);
		System.out.printf("%d\n", a[9]);
		System.out.printf("%d\n", a[8]);
		System.out.printf("%d\n", a[7]);
		
//		for(int x = 1; x < 10; x++) {
//			for(int y = 1; y < 10; y++) {
//				System.out.printf("%dx%d=%d\n", x, y, x * y);
//			}
//		}
	}
}