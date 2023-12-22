import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int total = 0;
		
		if(N>K){
		total = X*K + Y*(N-K);
		}else{
		total = X*N;	
		}
		System.out.println(total);

	}

}
