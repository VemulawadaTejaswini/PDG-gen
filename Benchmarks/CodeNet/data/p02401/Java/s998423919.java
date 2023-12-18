import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
			String str = br.readLine();
			String[] s = str.split(" ");
			int[] n = new int[s.length];


			n[0] = Integer.parseInt(s[0]);
			n[2] = Integer.parseInt(s[2]);
			if(n[0] >= 0 && n[0] <= 20000 && n[2] >= 0 && n[2] <= 20000){
				if(s[1].equals("+")){
					System.out.println(n[0] + n[2]);
				} else if(s[1].equals("-")) {
					System.out.println(n[0] - n[2]);
				} else if(s[1].equals("*")) {
					System.out.println(n[0] * n[2]);
				} else if(s[1].equals("/")) {
					System.out.println(n[0] / n[2]);
				} else if(s[1].equals("?")) {
					//System.exit(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}