import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner tc = new Scanner (System.in);
	int a,b;
	a=tc.nextInt();
	b=tc.nextInt();
	if(a>b) {
		System.out.println(a*2-1);
	}
	if(b>a) {
		System.out.println(b*2-1);
	}
	if(a==b) {
		System.out.println(a+b);
	}
}
}
