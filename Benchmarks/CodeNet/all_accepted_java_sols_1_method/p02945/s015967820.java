import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a=t.nextInt(), b=t.nextInt(), c = a +b,d = a - b,e = a *b;
		if(c>=d && c>=e) {
			System.out.println(c);
		}else {
			if(d>=c && d>=e) {
				System.out.println(d);
			}else {
				if(e>=d && e>=c) {
					System.out.println(e);
				}
			}
		}
	
	}
}