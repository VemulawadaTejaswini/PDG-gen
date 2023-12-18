import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();			
		}
		int cur = 1;
		int broke = 0;
		for(int i = 0 ; i < N ; ++i){
			if(A[i] == cur){
				++cur;
			}else{
				++broke;				
			}
		}
		if(broke == N){
			System.out.println(-1);
		}else{
			System.out.println(broke);			
		}
	}
}
