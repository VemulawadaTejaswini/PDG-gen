
import java.util.*;

class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//表の行数rと列数cを読み取る
		String s1 = sc.next();
		int r = Integer.parseInt(s1);
		String s2 = sc.next();
		int c = Integer.parseInt(s2);
		//表を値を配列に受け取る
		int a[][] = new int[r][c];
		
		//cとrが条件範囲内か確認
		if(1 <= r && r <= 100){
			if(1 <= c && c <= 100){
				
				//配列に格納していく
				for(int i = 0; i < r; i++ ){
					for(int j = 0; j < c; j++){
						String s3 = sc.next();
						int k = Integer.parseInt(s3);
						a[i][j] = k;
					}
				}
				
				int total = 0;
				//入力された表の値と行ごとの合計値の表示
				for(int i = 0; i < r; i++ ){
					int sum = 0;
					for(int j = 0; j < c; j++){
						System.out.print(a[i][j] + " ");
						sum += a[i][j];
					}
					total += sum;
					System.out.println( sum );
				}
				
				//入力された表の値の列ごとの合計値の表示
				for(int j = 0; j < c; j++ ){
					int sum = 0;
					for(int i = 0; i < r; i++){
						sum += a[i][j];
					}
					System.out.print( sum + " ");
				}
				System.out.println( total );
			}
		}
	}

}