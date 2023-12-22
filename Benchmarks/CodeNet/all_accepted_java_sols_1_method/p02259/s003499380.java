import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		int count = 0;
		
		for(int i = 1; i < n; i++){
			boolean flag = true;
		
			while(flag){
				flag = false;
			
				for(int j = n - 1; j > i - 1; j--){
					if(A[j] < A[j - 1]){
						int tmp = A[j];
						A[j] = A[j - 1];
						A[j - 1] = tmp;
						flag = true;
						
						count++;
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(A[i]);
			
			if(i + 1 == n){
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println(count);
	}
}