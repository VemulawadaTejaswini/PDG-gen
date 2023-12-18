import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;

	private void mainrun() {
		scan = new Scanner(System.in);

		n = Integer.parseInt(scan.nextLine());

		for(int i = 0;i < n;i++) {
			looprun();
		}

		scan.close();
	}

	private char[] rstr,astr,transb = "Hoshino".toCharArray(),transa = "Hoshina".toCharArray();

	private void looprun() {
		rstr = scan.nextLine().toCharArray();

		astr = new char[rstr.length + 1];

		for(int i = 0;i < rstr.length;i++) {
			if(rstr[i] == 'H' && (rstr.length - i >= 7)) {
				for(int j = 1;j < 7;j++) {
					if(rstr[j + i] != transb[j]) {
						astr[i] = rstr[i];
						break;
					}
					if(j == 6) {
						for(int k = 0; k < 7;k++) {
							astr[i + k] = transa[k];
						}
						i += 6;
					}
				}
			}else {
				astr[i] = rstr[i];
			}
		}
		astr[rstr.length] = '\n';

		Arrays.asList(astr).forEach(System.out::print);

	}
}
