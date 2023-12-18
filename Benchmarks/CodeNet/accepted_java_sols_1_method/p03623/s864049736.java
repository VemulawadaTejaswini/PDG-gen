import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),a=stdIn.nextInt(),b=stdIn.nextInt(),c,d;
		if(x-a>0) c=x-a;
		else c=a-x;
		if(x-b>0) d=x-b;
		else d=b-x;
		System.out.print(c>d?"B":"A");
	}
}