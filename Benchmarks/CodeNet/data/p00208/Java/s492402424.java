import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		String[] tmp = new String[]{"0","1","2","3","5","7","8","9"};
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			Long n = stdIn.nextLong();
			if(n == 0) break;
			String p = Long.toOctalString(n);
			for(int i = 0; i < p.length(); i++) {
				int tmpA = Integer.parseInt(String.valueOf(p.charAt(i)));
				System.out.print(tmp[tmpA]);
			}
			System.out.println();
		}
	}
	

}