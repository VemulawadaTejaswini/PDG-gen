import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			x = in.readLine();
			int n = Integer.parseInt(x);

			String[] xs = in.readLine().split(" ");
			String[] ys = in.readLine().split(" ");

			int[] px = new int[xs.length];
			int[] py = new int[ys.length];
			for (int i = 0; i < px.length; i++) {
				px[i] = Integer.parseInt(xs[i]);
				py[i] = Integer.parseInt(ys[i]);
			}

			double ans = 0.0;
			for (int i = 0; i < px.length; i++) {
				ans = ans + Math.abs(px[i] - py[i]);
			}
			System.out.println(ans);

			ans = 0.0;
			for (int i = 0; i < px.length; i++) {
				ans = ans + (px[i] - py[i]) * (px[i] - py[i]);
			}
			System.out.println(Math.sqrt(ans));

			ans = 0.0;
			for (int i = 0; i < px.length; i++) {
				ans = ans + Math.abs(px[i] - py[i] * (px[i] - py[i]) * (px[i] - py[i]));
			}
			System.out.println(Math.cbrt(ans));

			ans = 0.0;
			for (int i = 0; i < px.length; i++) {
				double d = Math.abs(px[i] - py[i]);
				if (ans < d) ans = d;
			}
			System.out.println(ans);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}