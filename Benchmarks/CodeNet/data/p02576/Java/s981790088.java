import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		
		do{
			N = T-N;
			T += T;
		}while(N-X>=0);
		
		System.out.print(T);
	}
}
