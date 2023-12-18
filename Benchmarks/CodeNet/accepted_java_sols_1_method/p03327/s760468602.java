import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		if(N <= 999) {
			System.out.print("ABC");
		}else {
			System.out.print("ABD");
		}
		in.close();
		
	}
}