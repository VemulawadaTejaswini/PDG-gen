import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt();
		System.out.print(a-b==b-c?"YES":"NO");
	}
}