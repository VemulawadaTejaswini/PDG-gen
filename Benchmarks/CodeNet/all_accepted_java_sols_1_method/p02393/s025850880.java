import java.util.Scanner;

public class Main {

public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int a =s.nextInt();
	int b= s.nextInt();
	int c = s.nextInt();
	int min;
	if(a>b) {
		min = a;
		a = b;
		b = min;
	}
	if(a>c) {
		min = a;
		a = c;
		c = min;
	}
	if(b>c) {
		min = b;
		b = c;
		c = min;
	}
	System.out.println(a+" "+b+" "+c);
	s.close();
}
}

