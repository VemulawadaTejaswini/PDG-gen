import java.util.Scanner;

public class Main {
	static int player_num;
	static int[] sum;
	
	static void erase_row_data(int[][] data, int match) {
		for(int r = 0; r < player_num; r++) {
			int buf = data[r][match]; //比較データ
			boolean flag = true;
			for(int c = 0; c < player_num; c++) {
				if(data[c][match] == buf && c != r) {
					data[c][match] = 0; //同じ得点があったら消去
					flag = false;
				}
			}
			if(!flag) data[r][match] = 0;
		}
	}
	
	static void calc_sum(int[][] data, int match) {
		for(int r = 0; r < player_num; r++) {
			sum[r] += data[r][match];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		player_num = stdIn.nextInt();//プレイヤーの人数
		final int match = 3; //試合数
		int[][] data = new int[player_num][3];//登録データ
		
		for(int r = 0; r < player_num; r++) {
			for(int c = 0; c < match; c++) {
				data[r][c] = stdIn.nextInt();
			}
		}
		
		for(int r = 0; r < match; r++) 
			erase_row_data(data, r);
		sum = new int[player_num];
		for(int r = 0; r < match; r++)
			calc_sum(data, r);
		
		for(int r = 0; r < player_num; r++)
			System.out.println(sum[r]);
	}
}