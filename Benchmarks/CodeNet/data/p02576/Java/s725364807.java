import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		
		while(N-X>=0){
			N = T-N;
			T += T;
		}
		
		System.out.print(T);
	}
}
