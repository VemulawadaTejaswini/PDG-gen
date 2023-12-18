import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S=sc.next();
		char[] c=S.toCharArray();

		for(int i=0;i<S.length();i++) {
			if(i%2==0) {
				System.out.print(c[i]);
			}
		}
	}
}