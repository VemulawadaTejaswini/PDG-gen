
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String strn = input.readLine( );
		int n = Integer.parseInt(strn);

		String strt = input.readLine( );
		String[] tlist = strt.split(" ");
		int[] t = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++){
			t[i] = Integer.parseInt(tlist[i]);
			sum = sum + t[i];
		}

		String strm = input.readLine( );
		int m = Integer.parseInt(strm);
		String[][] xlist = new String[m][];
		int answer = sum;

		for(int i=0; i<m; i++){
			String str = input.readLine( );
			xlist[i] = str.split(" ");
			answer = sum + Integer.parseInt(xlist[i][1]) - t[Integer.parseInt(xlist[i][0])-1];
			System.out.println(answer);
		}


	}

}
