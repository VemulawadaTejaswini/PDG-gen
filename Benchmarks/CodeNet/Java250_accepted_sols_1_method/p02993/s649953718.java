import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			int x = Integer.parseInt(chr[0]);
			int y = 0;
			String ans = "Good";
			for(int i =1; i<chr.length; i++) {
				y=Integer.parseInt(chr[i]);
				if(x==y) {
					ans = "Bad";
					break;
				}else {
					x=y;
				}
			}

			 System.out.println(ans);
		}
	}
}