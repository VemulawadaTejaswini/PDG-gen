import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt(),d=stdIn.nextInt();
		if(c>a) a=c;
		if(b>d) b=d;
		if(b-a>0) System.out.print(b-a);
		else System.out.print(0);
	}
}