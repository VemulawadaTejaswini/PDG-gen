import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		if(N<=K){//NがK以下
			System.out.println(N*X);
			
		}else{//NがKより大きい
			System.out.println(K*X+(N-K)*Y);
		}
		
		
		
		
	}

}
