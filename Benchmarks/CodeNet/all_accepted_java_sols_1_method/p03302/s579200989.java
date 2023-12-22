
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		
		Scanner Cf=new Scanner(System.in);
		int a=Cf.nextInt();
		int b=Cf.nextInt();
		if(a+b==15) {
			System.out.println("+");
		}
		else if(a*b==15) {
			System.out.println("*");
		}
		else {
			System.out.println("x");
		}
	}

}
