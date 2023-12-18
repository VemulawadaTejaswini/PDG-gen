import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < K; i++){
			int d = sc.nextInt();
			for(int j = 0; j < d; j++){
				A[sc.nextInt()-1]++;
			}
		}
		int count = 0;
		for(int r : A){
			if(r == 0){
				count++;
			}
		}
		System.out.print(count);
	}
}
