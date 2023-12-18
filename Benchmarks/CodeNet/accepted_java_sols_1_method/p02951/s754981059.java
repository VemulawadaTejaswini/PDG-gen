import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int x=b+c;
		if(a<x)
			System.out.println(x-a);
		else
			System.out.println("0");

	}

}
