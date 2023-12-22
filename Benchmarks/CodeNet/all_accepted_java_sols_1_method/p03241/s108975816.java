import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
		int maxValue = m / n;
		for (int i = 1; i <= maxValue; i++) {
		    if (m % i == 0) {
		        int ans = m / i;
		        if (ans <= maxValue) {
		            max = ans;
		            break;
		        }
		        max = i;
		    }
		}
		System.out.println(max);
	}
	
}
