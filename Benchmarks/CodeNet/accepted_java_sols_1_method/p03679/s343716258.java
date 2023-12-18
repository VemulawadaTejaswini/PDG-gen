import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),a=stdIn.nextInt(),b=stdIn.nextInt();
		if(b-a<1) System.out.print("delicious");
		else if(b-a<=x) System.out.print("safe");
		else System.out.print("dangerous");
	}
}