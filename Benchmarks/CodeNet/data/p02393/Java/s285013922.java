import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] s = str.split(" ");
		int[] n = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		if(n.length > 3){
			System.exit(0);
		}
		
		int a = n[0], b = n[1], c = n[2];
		
		if(a <= b && b <= c){
			a = n[0];
			b = n[1];
			c = n[2];
		} else if(a <= b && b >= c && a <= c) {
			a = n[0];
			b = n[2];
			c = n[1];
		} else if(a >= b && b <= c && a <= c) {
			a = n[1];
			b = n[0];
			c = n[2];
		} else if(a <= b && b >= c && a >= c) {
			a = n[1];
			b = n[2];
			c = n[0];
		} else if(a >= b && b <= c && a >= c) {
			a = n[2];
			b = n[0];
			c = n[1];
		} else if(a >= b && b >= c && a >= c) {
			a = n[2];
			b = n[1];
			c = n[0];
		}
		System.out.println(a + " " + b + " " + c);
	}
}