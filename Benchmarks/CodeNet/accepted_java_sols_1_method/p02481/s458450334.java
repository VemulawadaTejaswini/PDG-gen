import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int men;
		int shu;
		
		a = input.nextInt();
		b = input.nextInt();
		
		men = a * b;
		shu =  a * 2 + b * 2;
		
		System.out.println(men + " " + shu);
	}
}