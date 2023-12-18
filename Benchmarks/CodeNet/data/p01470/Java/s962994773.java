import java.util.Scanner;

public class Main {
 static final int ADD      = 1;
 static final int MINUS    = 2;
 static final int MULTIPLY = 3;
 static final int DIVIDE   = 4;

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int count = in.nextInt();
	long n = 0, d = 1;
	for (int i = 0; i < count; i++) {
	 int op = in.nextInt();
	 int num = in.nextInt();
	 switch (op) {
	 case MINUS:
		num = -num;
	 case ADD:
		n += d * num;
		break;
	 case MULTIPLY:
		n *= num;
		break;
	 case DIVIDE:
		d *= num;
		break;
	 }
	 if (n % d == 0) {
		n = n / d;
		d = 1;
	 }
	}
	System.out.println(n / d);
 }
}