import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static final int PANELS = 16;
	
	public static void bit_print(int bit){
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toBinaryString(bit));
		if(sb.length() < 16){
			final int diff = 16 - sb.length();
			
			for(int i = 0; i < diff; i++){
				sb.insert(0, "0");
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int c = sc.nextInt();
			
			if(n == 0 && c == 0){
				break;
			}
			
			int[] humen = new int[n];
			int[] hands = new int[c];
			
			/* set humen */
			for(int i = 0; i < n; i++){
				int bit = 0;
				for(int j = 0; j < PANELS; j++){
					final int hand = sc.nextInt();
					
					bit |= (hand << j);
				}
				
				humen[i] = bit;
			}
			
			/* set hands */
			for(int i = 0; i < c; i++){
				int bit = 0;
				for(int j = 0; j < PANELS; j++){
					final int hand = sc.nextInt();
					
					bit |= (hand << j);
				}
				
				hands[i] = bit;
			}
			
			int[][] dp = new int[n + 1][1 << PANELS];
			for(int i = 0; i <= n; i++){
				Arrays.fill(dp[i], -1);
			}
			dp[0][humen[0]] = 0;
			
			for(int time = 0; time < n; time++){
				for(int bit = 0; bit < 1 << PANELS; bit++){
					if(dp[time][bit] >= 0){
						for(int hand = 0; hand < c; hand++){
							final int hand_bit = hands[hand];	
							final int score = Integer.bitCount(hand_bit & bit);
							final int next_bit = (bit & (~hand_bit)) | (time + 1 < n ? humen[time + 1] : 0);
							
							
							//bit_print(bit);
							//bit_print(hand_bit);
							//bit_print(next_bit);
							
							dp[time+1][next_bit] = Math.max(dp[time+1][next_bit], dp[time][bit] + score);
						}
					}
				}
			}
			
			int max = 0;
			for(int i = 0; i < 1 << PANELS; i++){
				max = Math.max(max, dp[n][i]);
			}
			
			System.out.println(max);
		}
		
		
		sc.close();
	}
}