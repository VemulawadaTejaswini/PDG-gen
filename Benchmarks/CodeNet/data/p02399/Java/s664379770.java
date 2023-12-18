import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		double a=cin.nextFloat(),b=cin.nextFloat();
		System.out.printf("%d %d %f\n",(int)(a/b),(int)(a%b),a/b);
		
	}

}

