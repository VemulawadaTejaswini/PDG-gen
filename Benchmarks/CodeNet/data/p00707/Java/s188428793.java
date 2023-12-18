
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0  && H == 0){
				break;
			}
			
			int[][] map = new int[H][W];
			
			for(int i = 0; i < H; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++){
					if('0' <= input[j] && input[j] <= '9'){
						map[i][j] = input[j] - '0';
					}else{
						map[i][j] = -1;
					}
				}
			}
			
			int[][] len = new int[H][W];
			short[][][] dp = new short[H][W][H+W];
			
			int max = 0;
			int m_x = -1;
			int m_y = -1;
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(map[i][j] < 0){
						dp[i][j][0] = -1;
						len[i][j] = -1;
						continue;
					}
					
					if(i == 0 && j == 0){
						dp[i][j][0] = (short)(map[i][j]);
						len[i][j] = map[i][j] == 0 ? 0 : 1;
					}else if(j == 0){
						final int p_len = len[i-1][j];
						if(p_len == -1){
							dp[i][j][0] = (short)(map[i][j]);
							len[i][j] = map[i][j] == 0 ? 0 : 1;
						}else{
							System.arraycopy(dp[i-1][j], 0, dp[i][j], 0, p_len);
							dp[i][j][p_len] = (short)(map[i][j]);
							len[i][j] = p_len +  (p_len == 0 && map[i][j] == 0 ? 0 : 1);
						}
					}else if(i == 0){
						final int p_len = len[i][j-1];
						if(p_len == -1){
							dp[i][j][0] = (short)(map[i][j]);
							len[i][j] = map[i][j] == 0 ? 0 : 1;
						}else{
							System.arraycopy(dp[i][j-1], 0, dp[i][j], 0, p_len);
							dp[i][j][p_len] = (short)(map[i][j]);
							len[i][j] = p_len + (p_len == 0 && map[i][j] == 0 ? 0 : 1);
						}
					}else{
						final int left_len = len[i][j-1];
						final int up_len = len[i-1][j];
						
						if(left_len == -1 && up_len == -1){
							dp[i][j][0] = (short)(map[i][j]);
							len[i][j] = map[i][j] == 0 ? 0 : 1;
						}else if(left_len > up_len){
							final int p_len = len[i][j-1];
							System.arraycopy(dp[i][j-1], 0, dp[i][j], 0, p_len);
							dp[i][j][p_len] = (short)(map[i][j]);
							len[i][j] = p_len + (p_len == 0 && map[i][j] == 0 ? 0 : 1);
						}else if(left_len < up_len){
							final int p_len = len[i-1][j];
							System.arraycopy(dp[i-1][j], 0, dp[i][j], 0, p_len);
							dp[i][j][p_len] = (short)(map[i][j]);
							len[i][j] = p_len + (p_len == 0 && map[i][j] == 0 ? 0 : 1);
						}else{
							final int size = len[i][j-1];
							boolean left_f = true;
							for(int k = 0; k < size; k++){
								if(dp[i-1][j][k] < dp[i][j-1][k]){
									left_f = true;
									break;
								}else if(dp[i-1][j][k] > dp[i][j-1][k]){
									left_f = false;
									break;
								}
							}
							
							if(left_f){
								final int p_len = len[i][j-1];
								System.arraycopy(dp[i][j-1], 0, dp[i][j], 0, p_len);
								dp[i][j][p_len] = (short)(map[i][j]);
								len[i][j] = p_len + (p_len == 0 && map[i][j] == 0 ? 0 : 1);
							}else{
								final int p_len = len[i-1][j];
								System.arraycopy(dp[i-1][j], 0, dp[i][j], 0, p_len);
								dp[i][j][p_len] = (short)(map[i][j]);
								len[i][j] = p_len + (p_len == 0 && map[i][j] == 0 ? 0 : 1);
							}
						}
					}
					
					if(max < len[i][j]){
						max = len[i][j];
						m_x = j;
						m_y = i;
					}else if(max == len[i][j]){
						final int size = len[i][j];
						
						for(int k = 0; k < size; k++){
							if(dp[m_y][m_x][k] < dp[i][j][k]){
								max = len[i][j];
								m_x = j;
								m_y = i;
								break;
							}else if(dp[m_y][m_y][k] > dp[i][j][k]){
								break;
							}
						}
					}
				}	
			}
			/*
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					System.out.printf("%2d ", len[i][j]);
				}
				System.out.println();
			}
			*/
			for(int i = 0; i < max; i++){
				System.out.print(dp[m_y][m_x][i]);
			}
			System.out.println();
		}
		
	}

}