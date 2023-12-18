import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		System.out.print(1000>n?"ABC":"ABD");
	}
}