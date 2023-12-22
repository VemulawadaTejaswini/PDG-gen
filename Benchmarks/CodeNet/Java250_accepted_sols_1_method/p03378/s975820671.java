import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		Integer fee[] = new Integer[m];
		int costRight = 0;
		int costLeft =0;
		
		for(int i = 0; i < m; i ++) {
			fee[i] =sc.nextInt();
		}
		
		for(int i = x + 1; i <= n; i ++) {
			if(Arrays.asList(fee).contains(i)) {
				costRight ++;
			}
		}
		
		for(int i = x - 1; i >= 0; i --) {
			if(Arrays.asList(fee).contains(i)) {
				costLeft ++;
			}
		}
		
		if(costRight > costLeft) {
			System.out.println(costLeft);
		}else {
			System.out.println(costRight);
		}
	}
}