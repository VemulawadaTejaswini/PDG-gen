
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[5];
		int ans = 0;
		
		for(int i = 0; i < 5; i++) {
			x[i]	 = sc.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			if(x[i] == 0 && i != 0) {
				ans = x[i-1] + 1;
				break;
			}else if(x[i] == 0){
				ans = x[i+1] -1;
				break;
			}
		}
		System.out.println(ans);
	}
}