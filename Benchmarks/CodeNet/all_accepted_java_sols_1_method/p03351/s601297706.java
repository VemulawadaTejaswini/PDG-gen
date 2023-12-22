import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//String N = in.nextLine();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		if(Math.abs(a-c) <= d){
			System.out.print("Yes");
		}else if(Math.abs(a-b) <= d && Math.abs(c-b) <= d){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
		in.close();
	}
}