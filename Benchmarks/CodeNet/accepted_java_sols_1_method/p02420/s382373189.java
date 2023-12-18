import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		for(;;) {
		String a=scan.next();
		if(a.equals("-")) {
			break;
		}
		int b=scan.nextInt();
		for(int j=0;j<b;j++) {
			int c=scan.nextInt();
			a=a.substring(c,a.length())+a.substring(0,c);
		}
		System.out.println(a);
		}
	}
}
