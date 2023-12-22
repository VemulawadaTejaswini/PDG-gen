import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int x = Integer.parseInt(chr[0]);
			int y = Integer.parseInt(chr[1]);
			if (x == y) {
				System.out.println("Yes");
			}else if((x==2&&y!=2)||(x!=2&&y==2)){
				System.out.println("No");

			}else {
				String ansx = (x == 4 || x == 6 || x == 9 || x == 11 ? "B" : "C");
				String ansy = (y == 4 || y == 6 || y == 9 || y == 11 ? "B" : "C");
				System.out.println(ansx.equals(ansy) ? "Yes" : "No");
			}
		}
	}
}
