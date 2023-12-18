import java.util.Scanner;

class Main {
	public static void main(String[] argv){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("a"+(a>b?" > ":(a<b?" < ":" == "))+"b");
	}
}