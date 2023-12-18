import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int temp;
		if(a > b){
			temp=b;
			b=a;
			a=temp;
		}
		
		if(b > c){
			temp=b;
			b=c;
			c=temp;
		}
		if(a > b){
			temp=b;
			b=a;
			a=temp;
		}
		
		System.out.println(a+" "+b+" "+c);
	}
}
