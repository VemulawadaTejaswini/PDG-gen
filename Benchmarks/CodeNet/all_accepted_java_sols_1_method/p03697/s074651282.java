import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt();
		if(10>a+b) System.out.print(a+b);
		else System.out.print("error");
	}
}