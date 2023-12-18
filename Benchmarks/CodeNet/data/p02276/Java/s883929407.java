import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		String[] AStr = br.readLine().split(" ");
		int[] A = new int[n];
		for(int i = 0; i < n ; i++){
			A[i] = Integer.parseInt(AStr[i]);
		}
		int q = partition(A);

		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < n ; i++){
			if(i == q){
				sb.append("[");
				sb.append(A[i]);
				sb.append("]");
				sb.append(" ");
			}else{
				sb.append(A[i]);
				sb.append(" ");
			}
		}

		System.out.println(sb.toString().trim());
	}

	public static int partition(int[] A){
		int x = -1;
		int tmp;
		for(int i = 0 ; i < A.length - 1 ; i++ ){
			if(A[i] <= A[A.length - 1]){
				tmp = A[++x];
				A[x] = A[i];
				A[i] = tmp;
			}
		}
		tmp = A[A.length - 1];
		A[A.length - 1] = A[++x];
		A[x] = tmp;
		return x;
	}

}