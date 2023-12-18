import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		
		if(N%2==0) {
			System.out.print(N);
		} else {
			System.out.print(N*2);
		}
		in.close();
		
	}
}