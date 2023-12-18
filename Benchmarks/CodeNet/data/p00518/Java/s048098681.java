
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int to_bit(int owner, boolean j_at, boolean o_at, boolean i_at){
		return ((((((owner) << 2) + (j_at ? 1 : 0)) << 1) + (o_at ? 1 : 0)) << 1) + (i_at ? 1 : 0);
	}
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[] responsive = new int[n];
		char[] input = sc.next().toCharArray();
		for(int i = 0; i < n; i++){
			if(input[i] == 'J'){
				responsive[i] = 0;
			}else if(input[i] == 'O'){
				responsive[i] = 1;
			}else if(input[i] == 'I'){
				responsive[i] = 2;
			}
		}
		final int max_bit = 1 << 3;
		int[][] DP = new int[n][max_bit];
		for(int i = 0; i < 8; i++){
			if((i & 1) == 0){
				continue;
			}else if((i & (1 << responsive[0])) == 0){
				continue;
			}
			
			//System.out.println(Integer.toBinaryString(i));
			DP[0][i] = 1;
		}
		//System.out.println(Arrays.toString(DP[0]));
		
		int sum = 0;
		boolean[] duplicate = new boolean[max_bit];
		for(int day = 0; day < n; day++){
			for(int bit = 0; bit < 8; bit++){
				//1 => J, 2 => O, 4 => I
				if((bit & (1 << responsive[day])) == 0){ //責任者がいないとかありえない
					continue;
				}
				
				final int current_times = /*(owner << 3) + */bit;
				
				if(day == n - 1){
					sum += DP[day][current_times];
					sum %= 10007;
					continue;
				}
				
				Arrays.fill(duplicate, false);
				for(int owner = 0; owner < 3; owner++){
					//0 => J, 1 => O, 2 >= I
					final int owner_bit = 1 << owner;
					
					if((bit & owner_bit) == 0){ //持って帰る人は居ないと不味い
						continue;
					}
					
					for(int next_bit = 0; next_bit < 8; next_bit++){
						if((next_bit & owner_bit) == 0){ //持って帰った人が持ってこないと開催できない
							continue;
						}else if((next_bit & (1 << responsive[day + 1])) == 0){ //次の日の責任者も出席する
							continue;
						}else if(duplicate[next_bit]){
							continue;
						}
						duplicate[next_bit] = true;
						
						final int next_times = next_bit;
						
						DP[day + 1][next_times] += DP[day][current_times];
						DP[day + 1][next_times] %= 10007;
					}
				}
			}
		}
		/*
			for(int bit = 0; bit < 8; bit++){
				final int to_bit = bit;
				if(DP[n-1][to_bit] == 0){
					continue;
				}
				
				if((bit & 1) != 0){ System.out.print("J"); }
				if((bit & 2) != 0){ System.out.print("O"); }
				if((bit & 4) != 0){ System.out.print("I"); }
				System.out.println();
			}
		System.out.println(Arrays.toString(DP[1]));
		*/
		System.out.println(sum);
		
		
	}
}