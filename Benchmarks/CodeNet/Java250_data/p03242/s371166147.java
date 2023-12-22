import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		
		if(N/100 == 1) {
			System.out.print(9);
		}else {
			System.out.print(1);
		}
		N = N%100;
		if(N/10 == 1) {
			System.out.print(9);
		}else {
			System.out.print(1);
		}
		if(N%10 == 1) {
			System.out.print(9);
		}else {
			System.out.print(1);
		}
		
		
		in.close();
	}
}
