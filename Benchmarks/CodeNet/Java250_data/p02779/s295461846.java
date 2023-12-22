import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int flag =0;
		for (int k =0; k< n-1;) {
			if (arr[k+1]!=arr[k]) {
				k++;
			}
			else {
				flag =1;
				break;
				
			}
		}
		if (flag==0){
			System.out.println("YES");
		}
		else
			System.out.println("NO");

		
		
		
}
}