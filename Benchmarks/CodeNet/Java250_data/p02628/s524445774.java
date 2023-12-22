import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
			int[] strs = new int[n];
			for (int i = 0; i < n; i++) { 
				strs[i] = sc.nextInt(); 
            }
	       Arrays.sort(strs);
			int min = 0;
	        for(int j = 0; j < k;j++){
            	min += strs[j]; 
            }
			System.out.println(min);
	}
}