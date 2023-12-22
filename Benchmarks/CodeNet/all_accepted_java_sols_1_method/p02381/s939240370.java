import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		while( true ){
			int n = Integer.parseInt(br.readLine());
			int i = 0;
			double m = 0;
			double a = 0;

			if( n==0 ) break;

			String[] s = br.readLine().split(" ");

			for( i=0 ; i<n ; i++ ){
				m = m+Double.parseDouble(s[i]);
			}

			m = m/n;

			for( i=0 ; i<n ; i++ ){
				a = a+Math.pow(Double.parseDouble(s[i])-m, 2);
			}

			a = Math.sqrt(a/n);
			sb.append(String.format("%.6f", a)).append("\n");
 		}

		System.out.print(sb);
	}
}