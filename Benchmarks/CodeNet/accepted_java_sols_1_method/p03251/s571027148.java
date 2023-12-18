
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final String WAR = "War";
	private static final String NO_WAR = "No War";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 設定情報
		int xCount = scan.nextInt();
		int yCount = scan.nextInt();
		int xPosition = scan.nextInt();
		int yPosition = scan.nextInt();
		
		// xの情報
		int[] x = new int[xCount];
		for(int i=0;i<xCount;i++){
			x[i] = scan.nextInt();
		}
		
		// yの情報
		int[] y = new int[yCount];
		for(int i=0;i<yCount;i++){
			y[i] = scan.nextInt();
		}
		
		// xの値のソート
		Arrays.sort(x);
		// yの値のソート
		Arrays.sort(y);
		
		// xの最大値 ＞＝ yの最小値となるかどうか判定する
		String result;
		if(x[xCount-1] >= y[0]){
			result = WAR;
		}else{
			// Zの範囲判定考慮追加 X < Z ≦ Y
			if(x[xCount-1] > xPosition &&
					y[0] <= yPosition){
				result = NO_WAR;
			}else{
				result = WAR;
			}
		}
		
		System.out.println(result);
		
		

	}

}
