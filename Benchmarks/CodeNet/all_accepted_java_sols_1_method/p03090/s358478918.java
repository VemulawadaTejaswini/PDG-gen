
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		
		
		if(N%2 == 1){
			int M = (N-1)*(N-1)/2;
			System.out.println(M);
			for(int a=1; a<N; a++){
				for(int b=a+1; b<=N; b++){
					if(a+b != N)System.out.println(a+" "+b);
				}
			}
		}
		
		if(N%2 == 0){
			int M = N*(N-2)/2;
			System.out.println(M);
			for(int a=1; a<N; a++){
				for(int b=a+1; b<=N; b++){
					if(a+b != N+1)System.out.println(a+" "+b);
				}
			}
		}
		
		sc.close();
	}

	
}
