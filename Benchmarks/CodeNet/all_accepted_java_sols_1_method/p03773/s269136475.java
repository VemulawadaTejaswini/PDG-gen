import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if( a+b < 24 ){
		System.out.println(a+b);
		}
		else{
		System.out.println(a+b-24);
		}
	}
}