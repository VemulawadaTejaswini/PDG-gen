import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int arr[] = new int[N];
		for (int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				arr[sc.nextInt()-1]++;
			}
		}
		int cnt = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
    }
		
		
}
