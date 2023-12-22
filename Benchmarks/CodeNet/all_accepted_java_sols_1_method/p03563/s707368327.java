import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int r=stdIn.nextInt(),g=stdIn.nextInt();
		System.out.print(2*g-r);
	}
}