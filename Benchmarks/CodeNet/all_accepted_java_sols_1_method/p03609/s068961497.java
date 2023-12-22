import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),t=stdIn.nextInt();
		if(0>x-t) System.out.print("0");
		else System.out.print(x-t);
	}
}