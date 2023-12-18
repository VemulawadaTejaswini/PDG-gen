import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(tk.nextToken());
		int num2 = Integer.parseInt(tk.nextToken());
		int num3 = Integer.parseInt(tk.nextToken());

		A AAA = (int a, int b, int c) -> {
			if( a<b && b<c ) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			};
		};

		AAA.Judgment(num, num2, num3);
	}
}

interface A{
	void Judgment(int a,int b,int c);
}
