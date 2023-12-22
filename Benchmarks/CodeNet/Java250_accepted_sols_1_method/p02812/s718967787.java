import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String okikae = s.replace("ABC" , "0");
		int count = 0;

		char[] c = new char[okikae.length()];
		c = okikae.toCharArray();
		for(int i=0 ; i<okikae.length() ; i++) {
			if(c[i] == '0') {
				count++;
			}
		}
		System.out.print(count);
	}
}