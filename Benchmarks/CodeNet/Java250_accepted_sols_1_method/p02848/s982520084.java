import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		scan.close();
		char a='A';
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]+n>=a+26) {
				c[i]=(char)(c[i]+n-26);
			}else {
				c[i]+=n;
			}
			System.out.print(c[i]);
		}
		System.out.println();
	}
}