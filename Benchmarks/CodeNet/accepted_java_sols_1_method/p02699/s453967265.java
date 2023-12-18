import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		int S;
		int W;
		Scanner scan = new Scanner(System.in);

		S = scan.nextInt();
		W = scan.nextInt();

		if(S > W){
			System.out.println("safe");
		}else if(W >= S){
			System.out.println("unsafe");
		}
	}
}