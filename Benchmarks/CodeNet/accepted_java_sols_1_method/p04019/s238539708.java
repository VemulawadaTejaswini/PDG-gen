import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String s = in.readLine().toUpperCase();
		int count[] = new int[4];
		boolean[] vis = new boolean[4];
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'S':
				count[0]++;
				vis[0] = true;
				break;
			case 'N':
				count[1]++;
				vis[1] = true;
				break;
			case 'E':
				count[2]++;
				vis[2] = true;
				break;
			case 'W':
				count[3]++;
				vis[3] = true;
				break;

			}
		}
		if (vis[0] && vis[1] && vis[2] && vis[3]) {
			System.out.println("Yes");
		} else if (vis[0] && vis[1] && !vis[2] && !vis[3]) {
			System.out.println("Yes");
		} else if (vis[2] && vis[3] && !vis[0] && !vis[1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		out.close();
		in.close();
	}

	// static bb(long[]arr, int pi,int pf){
	// for(int i= pi+1:i<=pf;i++)for(int j = pf;j>=i;j--)
	// }
}
