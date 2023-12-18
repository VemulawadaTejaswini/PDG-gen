import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int search(int sum, int count, int size, int o_size, int m, int[] odd, int[] even){
		if(count == size){
			return sum == 0 ? 1 : 0;
		}
		
		int ret = 0;
		for(int i = 0; i < m; i++){
			if(count < o_size){
				ret += search((sum + odd[i]) % 10, count + 1, size, o_size, m, odd, even);
			}else{
				ret += search((sum + even[i]) % 10, count + 1, size, o_size, m, odd, even);
			}
		}
		
		return ret;
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final char[] str = sc.next().toCharArray();
		final int m = sc.nextInt();
		int[] a = new int[m];
		
		for(int i = 0; i < m; i++){
			a[i] = sc.nextInt();
		}
		
		int[] odd_mod = new int[m];
		int[] even_mod = new int[m];
		
		for(int i = 0; i < m; i++){
			odd_mod[i] = a[i];
			even_mod[i] = ((a[i] * 2) / 10) + ((a[i] * 2) % 10);
		}
		
		int odd_count = 0, even_count = 0;
		int first_mod = 0;
		
		for(int i = 0; i < str.length; i++){
			if((i + 1) % 2 == 1){
				if(str[i] == '*'){
					odd_count++;
				}else{
					first_mod += (str[i] - '0');
					first_mod %= 10;
				}
			}else{
				if(str[i] == '*'){
					even_count++;
				}else{
					first_mod += ((str[i] - '0') * 2) / 10 + ((str[i] - '0') * 2) % 10;
					first_mod %= 10;
				}
			}
		}
		
		if(odd_count == 0 && even_count == 0){
			System.out.println(first_mod == 0 ? 1 : 0);
			return;
		}
		//System.out.println(first_mod);
		
		/*
		long[][] dp = new long[odd_count + even_count][10];
		for(int i = 0; i < odd_count + even_count; i++){
			if(i == 0){
				if(i < odd_count){
					for(int j = 0; j < m; j++){
						dp[i][(first_mod + odd_mod[j]) % 10]++;
					}
				}else{
					for(int j = 0; j < m; j++){
						dp[i][(first_mod + even_mod[j]) % 10]++;
					}
				}
			}else{
				if(i < odd_count){
					for(int j = 0; j < 10; j++){
						for(int k = 0; k < m; k++){
							dp[i][(j + odd_mod[k]) % 10] += dp[i-1][j];
						}
					}
				}else{
					for(int j = 0; j < 10; j++){
						for(int k = 0; k < m; k++){
							dp[i][(j + even_mod[k]) % 10] += dp[i-1][j];
						}
					}
				}
			}
			System.out.println(Arrays.toString(dp[i]));
		}
		*/
		System.out.println(search(first_mod, 0, odd_count + even_count, odd_count, m, odd_mod, even_mod));
	}

}