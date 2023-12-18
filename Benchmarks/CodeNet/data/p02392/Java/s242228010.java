import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		int a;
		int b;
		int c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ", 0);
		a = Integer.parseInt(num[0]);
		b = Integer.parseInt(num[1]);
		c = Integer.parseInt(num[2]);
		compare(a, b, c);
	}

	private static void compare(int a, int b, int c) {
		if (a < b) {
			if(b < c){
				System.out.println("YES");
			}else{
			System.out.println("NO");
			}
		} else  {
			System.out.println("NO");
		}
	}

}