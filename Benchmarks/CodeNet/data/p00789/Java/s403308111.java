import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] dp = new int[n+1];
			dp[0] = 1;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i * i <= n; i++){
				list.add(i * i);
			}
			
			for(int coin : list){
				for(int i = 0; i < dp.length; i++){
					if(dp[i] > 0 && i + coin <= n){
						dp[i+coin] += dp[i];
					}
				}
			}
			
			System.out.println(dp[n]);
			
		}
	}

}