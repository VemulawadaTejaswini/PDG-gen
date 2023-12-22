import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			String str=scan.next();
			int x=0;
			if(str.equals("0")) break;
			for(int i=0;i<str.length();i++) {
					x += str.charAt(i)-48;
				}
			System.out.println(x);
		}
		scan.close();
}
}
