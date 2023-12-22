import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String AStr[] = br.readLine().split(" ");
		int A[] = new int[n];

		for(int i = 0 ; i < n ; i++) A[i] = Integer.parseInt(AStr[i]);

		bubbleSort(n,A);

	}

	public static void bubbleSort(int n, int[] A){
		boolean flag = true;
		int count = 0;
		int y = 1;
		while(flag){
			flag = false;
			for(int i = n - 1 ; y <= i ; i-- ){
				if(A[i] < A[i - 1]){
					int tmp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = tmp;
					flag = true;
					count++;
				}
			}
			y++;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n; i++){
			sb.append(A[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		System.out.println(count);

	}
}