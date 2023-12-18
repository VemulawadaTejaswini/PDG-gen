import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		if(a+b==15) {
			System.out.println("+");
		}else if(a*b==15) {
			System.out.println("*");
		}else {
			System.out.println("x");
		}
	}
}