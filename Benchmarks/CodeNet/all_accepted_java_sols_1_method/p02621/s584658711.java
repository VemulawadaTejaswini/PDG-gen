import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a=stdIn.nextInt(),b;
		b = a + (int)Math.pow(a,2) + (int)Math.pow(a, 3);
		System.out.println(b);
		stdIn.close();
	}
}
