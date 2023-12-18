import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
			String[] strs = new String[n];
			for (int i = 0; i < n; i++) { 
				strs[i] = sc.nextLine(); 
            }
	       Arrays.sort(strs);
	        for(int j = 0; j < k;j++){
            	int min += srts[j]; 
            }
			System.out.println(min);
	}
}