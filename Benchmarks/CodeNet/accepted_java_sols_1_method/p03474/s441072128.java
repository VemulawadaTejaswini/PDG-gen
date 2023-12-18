import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String s = scan.next();
		scan.close();
		int check=0;
		if(s.length()!=a+b+1)check=1;
		else {
			for(int i=0;i<a+b+1;i++) {
				if(s.charAt(i)=='-' &&i!=a  || i==a && s.charAt(i)!='-') {
					check=1;
					break;
				}
			}
		}
		System.out.println((check==1)? "No":"Yes");
	}
}