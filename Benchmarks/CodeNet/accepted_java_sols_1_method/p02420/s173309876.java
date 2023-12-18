import java.util.Scanner;

public class Main {
	public	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String n = sc.next();
			if(n.contains("-")){
				break;
			}
			int m = sc.nextInt();
			int h = 0;
			for(int i = 0;i < m; i++) {
				h += sc.nextInt();
			}
			int a = h%n.length();
			if(a != 0) {
				 n = n.substring(a) + n.substring(0,a);
			 }

			 System.out.println(n);
		}
	}
}
