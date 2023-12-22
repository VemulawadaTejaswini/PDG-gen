import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int r=stdIn.nextInt(),g=stdIn.nextInt(),b=stdIn.nextInt();
		System.out.print((r*100+g*10+b)%4==0?"YES":"NO");
	}
}