import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++){
			ar[i] = sc.nextInt();
		}
		
		int key,i,j,k;
		for(i = 1; i < n; i++){
			
			for (j = 0; j < n - 1; j++){
				System.out.print(ar[j] + " ");
			}
			System.out.println(ar[n - 1]);
			
			key = ar[i];
			k = i - 1;
			while(k >= 0 && ar[k] > key){
				ar[k+1] = ar[k];
				k--;
			}
			ar[k+1] = key;
		}
		
		for (i = 0; i < n - 1; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println(ar[n - 1]);
	}
}