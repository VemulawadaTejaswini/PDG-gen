import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int x = a * b;
		int y = (a + b) * 2;

		System.out.println(x + " " +y);
		scan.close();
	}
}
