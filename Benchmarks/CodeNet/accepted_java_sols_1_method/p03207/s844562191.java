import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int prices[] = new int[N];
		
		int maxPrice = -1;
		int maxIndex = -1;
		for(int i = 0; i < N; i++) {
		    prices[i] = sc.nextInt();
		    if(maxPrice < prices[i]) {
		        maxPrice = prices[i];
		        maxIndex = i;
		    }
		}
        
        int sum = 0;
        for(int i = 0; i < N; i++) {
            if (i == maxIndex) {
                sum += prices[i] / 2;
            } else {
                sum += prices[i];
            }
        }
        System.out.println(sum);
	}
}