import java.math.BigInteger;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	public void mainrun() {
		scan = new Scanner(System.in);

		while(scan.hasNext()) {
			looprun();
		}
	}

	public void looprun() {
		String ans = "NA";
		String s = scan.next();

		boolean skip = false;
		String[] str = s.split("[+=]");

		for(String es : str) {
			if(es.charAt(0) == 'X' && es.length() > 1) {
				skip = true;
				break;
			}
		}

		for(int i = (skip ? 1 : 0 );i <= 9;i++) {

			BigInteger a = new BigInteger(str[0].replaceAll("X", Integer.toString(i)));
			BigInteger b = new BigInteger(str[1].replaceAll("X", Integer.toString(i)));
			BigInteger c = new BigInteger(str[2].replaceAll("X", Integer.toString(i)));

			if(a.add(b).equals(c)) {
				ans = Integer.toString(i);
				break;
			}
		}

		System.out.println(ans);

	}
}
