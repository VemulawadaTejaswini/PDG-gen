import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt(),d=stdIn.nextInt();
		if(a+b==c+d) System.out.print("Balanced");
		else if(a+b>c+d) System.out.print("Left");
		else System.out.print("Right");
	}
}