import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();

		for(int i=0; i<N; i++){ 
			String id = "node "+(i+1)+": ";
			String k = "key = "+A[i]+", ";
			String p = ( (i!=0)? "parent key = "+A[(i+1)/2-1]+", " : "" );
			String lk = ( 2*(i+1)<=N?  "left key = "+A[2*(i+1)-1]+", " : "");
			String rk = ( 2*(i+1)+1<=N? "right key = "+A[2*(i+1)]+", " : "");
			
			System.out.print(id + k + p + lk + rk + "\n");
		}

	}
}

	