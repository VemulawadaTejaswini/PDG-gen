import java.util.Scanner;

public class Main {
private static Scanner scanner;

public static void main(String args[])
{
	scanner = new Scanner(System.in);
	int a = scanner.nextInt(),b = scanner.nextInt();
	if(a < b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	while(a%b != 0) {
		int c = a%b;
		a = b;
		b = c;
	}
	System.out.println(b);
}
}


