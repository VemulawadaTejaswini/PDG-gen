import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		
		n = sc.nextInt();

		int[] ar = new int[n];
		
		for(int i = 0;i < n;i++){
			ar[i] = sc.nextInt();
		}

		Arrays.sort(ar);
		
		if(0 < n){
			System.out.print(ar[0]);
		}
		for (int i = 1; i < n; i++){
			System.out.print(" " + ar[i]);
		}
		System.out.println();
	}
}