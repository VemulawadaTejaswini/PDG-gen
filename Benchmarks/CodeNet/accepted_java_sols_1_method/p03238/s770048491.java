import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		if(a==1) {
			System.out.println("Hello World");
		}
		else if(a==2) {
			int b=x.nextInt();
			int c=x.nextInt();
			System.out.println(b+c);
		}
	}
}