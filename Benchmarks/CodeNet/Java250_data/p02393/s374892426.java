import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public int n = 0;
	
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
		int a = n[0];
		int b = n[1];
		int c = n[2];
		Main main = new Main();
		main.calculate(a, b, c);
	}
	public void calculate(int a, int b, int c){
		if(a <= b && b <= c ) {
			System.out.println(a + " " + b + " " + c);
			System.exit(0);
		}
		if(a > b) {
			n = a;
			a = b;
			b = n;
			calculate(a, b, c);
		} else if(b > c) {
			n = b;
			b = c;
			c = n;
			calculate(a, b, c);
		}
	}
}