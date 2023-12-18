import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static boolean is_same(int fst_top, int fst_front, int fst_left, int fst_right, int fst_back, int fst_bottom,
			int snd_top, int snd_front, int snd_left, int snd_right, int snd_back, int snd_bottom){
		
		for (int v = 0; v < 4; v++) {
			for (int t = 0; t < 4; t++) {
				for(int k = 0; k < 4; k++){
				
					if(fst_top == snd_top && fst_front == snd_front && fst_left == snd_left && 
							fst_right == snd_right && fst_back == snd_back && fst_bottom == snd_bottom){
						return true;
					}
					
					int tmp = fst_front;
					fst_front = fst_left;
					fst_left = fst_back;
					fst_back = fst_right;
					fst_right = tmp;
				}
				
				int tmp = fst_bottom;
				fst_bottom = fst_right;
				fst_right = fst_top;
				fst_top = fst_left;
				fst_left = tmp;
			}

			int tmp = fst_bottom;
			fst_bottom = fst_front;
			fst_front = fst_top;
			fst_top = fst_back;
			fst_back = tmp;
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[][] arr = new int[n][6];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 6; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean any_same = false;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				any_same |= is_same(arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4], arr[i][5],
						arr[j][0], arr[j][1], arr[j][2], arr[j][3], arr[j][4], arr[j][5]);
			}
		}

		System.out.println(any_same ? "No" : "Yes");
	}
}