import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		String str;
		int[][] score = new int[3][100];
		int n = 0;
		int rank = 1;
		int j, v, w;
		int ans;
		
		while(true){
			str = scan.next();
			if(str.equals("0,0"))break;
			String[] num = str.split(",", 0);
			score[0][n] = Integer.parseInt(num[0]);
			score[1][n] = Integer.parseInt(num[1]);
			n++;
		}
		for(int i  = 1; i <= n - 1; i++){
			w = score[0][i];
			v = score[1][i];
			j = i - 1;
			while(j >= 0 && score[1][j] < v){
				score[1][j + 1] = score[1][j];
				score[0][j + 1] = score[0][j];
				j--;
			}
			score[1][j + 1] = v;
			score[0][j + 1] = w;
		}
		for(int i = 0; i < n; i++){
			score[2][i] = rank;
			if(n < 99){
				if(score[1][i]  > score[1][i + 1])rank++;
			}
		}
		
		while(scan.hasNextInt()){
			ans = scan.nextInt();
			for(int i = 0; i < n; i++){
				if(ans == score[0][i]){
					System.out.println(score[2][i]);
					break;
				}
			}
		}
	}
}