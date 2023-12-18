import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    StringTokenizer st = new StringTokenizer(str, " ");

		int w  = Integer.parseInt(st.nextToken());
		int h  = Integer.parseInt(st.nextToken());
		int x  = Integer.parseInt(st.nextToken());
		int y  = Integer.parseInt(st.nextToken());
		int r  = Integer.parseInt(st.nextToken());

		if(w >= (x + r) && h >= (y + r ) && x > r && y > r && 0 <= x && 0 <= y ) {
			System.out.println("Yes");

		}else {
			System.out.println("No");
		}

	}

}