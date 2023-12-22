
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		char c;
		while(sc.hasNext()) {
			a = sc.nextInt();
			c = sc.next().toCharArray()[0];
			b = sc.nextInt();
			if(c == '+') System.out.println(a+b);
			else if(c == '-') System.out.println(a-b);
			else if(c == '/') System.out.println(a/b);
			else if(c == '*') System.out.println(a*b);
			else if(c == '?') break;
		}
	}
	
}

