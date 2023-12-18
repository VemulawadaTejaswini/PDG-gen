import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String[] s;
		int a, b, c;
		for(int i = 0; i < n; ++i) {
			s = br.readLine().split(" ");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			c = Integer.parseInt(s[2]);
			if(a*a == b*b + c*c || b*b == c*c + a*a || c*c == a*a + b*b) {
				sb.append("YES\n");
			}else{
				sb.append("NO\n");
			}
		}
		System.out.print(sb);
	}

}