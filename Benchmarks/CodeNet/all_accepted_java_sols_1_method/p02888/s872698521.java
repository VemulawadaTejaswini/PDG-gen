import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int n = scan.nextInt();
			
			Integer[] l = new Integer[n];
			
			int ans = 0;
			for(int i=0; i<n; i++) {
				l[i] = scan.nextInt();
			}
			
			Arrays.sort(l, Comparator.reverseOrder());
			
			for(int i=0; i<n-2; i++) {
				for(int j=i+1; j<n-1; j++) {
					for(int k=j+1; k<n; k++)
					if(l[i] < l[j] + l[k]) {
						ans++;
					} else {
						break;
					}
				}
			}
			
			
			System.out.println(ans);
		}
	}
}