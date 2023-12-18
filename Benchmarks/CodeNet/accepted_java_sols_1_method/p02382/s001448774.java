import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int n = Integer.parseInt(br.readLine());
		String[] x = br.readLine().split(" ");
		String[] y = br.readLine().split(" ");

		double ans = 0;
		int i = 0;

		for( i=0 ; i<n ; i++ ){
			ans = ans+Math.abs(Double.parseDouble(x[i])-Double.parseDouble(y[i]));
		}

		sb.append(String.format("%.6f", ans)).append("\n");
		ans = 0;

		for( i=0 ; i<n ; i++ ){
			ans = ans+Math.pow(Math.abs(Double.parseDouble(x[i])-Double.parseDouble(y[i])), 2);
		}

		sb.append(String.format("%.6f", Math.sqrt(ans))).append("\n");
		ans = 0;

		for( i=0 ; i<n ; i++ ){
			ans = ans+Math.pow(Math.abs(Double.parseDouble(x[i])-Double.parseDouble(y[i])), 3);
		}

		sb.append(String.format("%.6f", Math.cbrt(ans))).append("\n");
		ans = 0;

		for( i=0 ; i<n ; i++ ){
			ans = Math.max(Math.abs(Double.parseDouble(x[i])-Double.parseDouble(y[i])), ans);
		}

		sb.append(String.format("%.6f", ans)).append("\n");
		ans = 0;

		System.out.print(sb);
	}
}