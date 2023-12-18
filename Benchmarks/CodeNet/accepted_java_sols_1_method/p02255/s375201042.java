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
		
		
		for(int i = 0; i < n; i++){
			System.out.print(A[i]);
			
			if(i + 1 == n){
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
		
		for(int i = 1; i < n; i++){
			int v = A[i];
			int j = i - 1;
			
			while(j >= 0 && A[j] > v){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			
			for(int k = 0; k < n; k++){
				System.out.print(A[k]);
				
				if(k + 1 == n){
					System.out.print("\n");
				} else {
					System.out.print(" ");
				}
			}
		}
	}

}