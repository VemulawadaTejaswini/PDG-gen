import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		long[][] A = new long[N][2];
		for(int i=0;i<N;i++){
			A[i][0] = Integer.parseInt(sc.next());
			A[i][1] = Integer.parseInt(sc.next());
		}
		Arrays.sort(A, (a, b) -> Long.compare(a[0], b[0]));
		int needBuy = M;
		long ans = 0;
		int count = 0;
		while(needBuy > 0){
			if(needBuy <= A[count][1]){
				ans += needBuy*A[count][0]; 
				needBuy = 0;
			}
			if(needBuy > A[count][1]){
				ans += A[count][1]*A[count][0]; 
				needBuy -= A[count][1];
				count++;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	

}
