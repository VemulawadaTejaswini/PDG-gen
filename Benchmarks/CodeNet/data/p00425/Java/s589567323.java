import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		
		while(true) {
			String line = br.readLine();
			int n = Integer.parseInt(line);
			if(n == 0)break;
			
			Dice dice = new Dice();
			
			int sum = 1;
			for(int i = 0;i < n;i++) {
				line = br.readLine();
				if(line.equals("North")) {
					dice.north();
				}else if(line.equals("East")) {
					dice.east();
				}else if(line.equals("South")) {
					dice.south();
				}else if(line.equals("West")) {
					dice.west();
				}else if(line.equals("Right")) {
					dice.right();
				}else {
					dice.left();
				}
				
				sum += dice.getUpper();
			}
			
			sumList.add(sum);
		}
		
		// データセットごとに上面の数の合計値を出力する
		for(int sum : sumList) {
			System.out.println(sum);
		}
	}
}

// サイコロクラス
class Dice{
	private int upper;
	private int north;
	private int east;
	private int south;
	private int west;
	private int bottom;
	
	// コンストラクタ
	public Dice() {
		upper = 1;
		north = 5;
		east = 3;
		south = 2;
		west = 4;
		bottom = 6;
	}
	
	// サイコロの上面を取得するメソッド
	public int getUpper() {
		return upper;
	}
	
	// 北方向へ90度回転させるメソッド
	public void north() {
		int temp = upper;
		upper = south;
		south = bottom;
		bottom = north;
		north = temp;
	}
	
	// 東方向へ90度回転させるメソッド
	public void east() {
		int temp = upper;
		upper = west;
		west = bottom;
		bottom = east;
		east = temp;
	}
	
	// 南方向へ90度回転させるメソッド
	public void south() {
		int temp = upper;
		upper = north;
		north = bottom;
		bottom = south;
		south = temp;
	}
	
	// 西方向へ90度回転させるメソッド
	public void west() {
		int temp = upper;
		upper = east;
		east = bottom;
		bottom = west;
		west = temp;
	}
	
	// 右回りに90度回転させるメソッド
	public void right() {
		int temp = north;
		north = west;
		west = south;
		south = east;
		east = temp;
	}
	
	// 左回りに90度回転させるメソッド
	public void left() {
		int temp = north;
		north = east;
		east = south;
		south = west;
		west = temp;
	}
}

