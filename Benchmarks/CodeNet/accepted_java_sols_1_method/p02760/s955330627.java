import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][3];
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				array[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int[] rows = new int[3];
		int[] cols = new int[3];
		for(int k = 0; k<n; k++){
			int b = sc.nextInt();
			for(int w = 0; w<3; w++){
				for(int m = 0; m<3; m++){
					if(array[w][m] == b){
						array[w][m] = 0;
						rows[w]++;
						cols[m]++;
					}
				}
			}
		}
		String ans = "No";
		for(int i = 0; i<3; i++){
			if(rows[i] == 3 || cols[i] == 3){
				ans = "Yes";
				break;
			}
		}
		if(array[0][0] == 0 && array[1][1] == 0 && array[2][2] == 0 ||
			array[0][2] == 0 && array[1][1] == 0 && array[2][0] == 0){
			ans = "Yes";
		}
		System.out.println(ans);
		sc.close();
	}
}