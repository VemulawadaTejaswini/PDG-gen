
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int c1=0;
		int c2=0;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				if(str.charAt(i)=='0') {
					c1++;
				}
				else {
					c2++;
				}
			}
			if(i%2==1) {
				if(str.charAt(i)=='1') {
					c1++;
				}
				else {
					c2++;
				}
			}
		}
		System.out.println(Math.min(c1, c2));
	}
}