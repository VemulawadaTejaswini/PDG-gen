
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		char[] c = S.toCharArray();
		
		int r1 = 0;
		int r2 = 0;
		for(int i=0; i<c.length; i++) {
			if(i%2==1) {
				//奇数 0
				if(c[i]=='1') {
					r1++;
				} else {
					r2++;
				}
			} else {
				//偶数 1
				if(c[i]=='0') {
					r1++;
				} else {
					r2++;
				}
			}
		}
		if(r1<r2) {
			System.out.println(r1);
		} else {
			System.out.println(r2);
		}
		

	}

}
