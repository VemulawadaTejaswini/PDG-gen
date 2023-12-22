import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		if(N==1) {
			System.out.println("Hello World");
			System.exit(0);
		}
		
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(A+B);
		
		
		in.close();
	}
}
