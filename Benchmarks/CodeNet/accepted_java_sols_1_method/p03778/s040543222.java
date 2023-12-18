import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int w=stdIn.nextInt(),a=stdIn.nextInt(),b=stdIn.nextInt();
		if(b+w>=a&&a+w>=b) System.out.print(0);
		else if(a>b+w) System.out.print(a-b-w);
		else System.out.print(b-a-w);
	}
}