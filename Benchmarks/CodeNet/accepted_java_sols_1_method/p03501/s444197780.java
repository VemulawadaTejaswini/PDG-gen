import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a=stdIn.nextInt(),b=stdIn.nextInt();
		if(a*n>b) System.out.print(b);
		else System.out.print(a*n);
	}
}