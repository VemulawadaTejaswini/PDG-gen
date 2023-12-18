
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			String tmp = s.next();
			if(tmp.equals("-")) {
				break;
			}
			int m = s.nextInt();
			for(int i = 0; i < m; i++) {
				int h = s.nextInt();
				String k1 = tmp.substring(h);
				String k2 = tmp.substring(0,h);
				tmp = k1+k2;
			}
			System.out.println(tmp);
		}
	}
}