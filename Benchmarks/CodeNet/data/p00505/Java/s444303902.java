import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static ArrayList<String> dataSet = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		inputDataSet(""); // データセットを読み込み、dataSetに格納する

		int[] typesNum = new int[3];
		for(String line : dataSet) {
			String[] data = line.split(" ");
			int a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			int c = Integer.parseInt(data[2]);

			Triangle triangle = new Triangle(a, b, c);
			int type = triangle.type(); // 三角形の種類を受け取る
			if(type == -1)break; // 三角形にならない場合、ループを抜ける
			typesNum[triangle.type()]++; // 対応する種類をインクリメント
		}
		
		int triangleNum = typesNum[0] + typesNum[1] + typesNum[2];
		
		System.out.println(String.format("%d %d %d %d",
				triangleNum, typesNum[0], typesNum[1], typesNum[2]));
	}

	// 終端(terminal)まで読み込み、行ごとにdataSetに格納していくメソッド
	public static void inputDataSet(String terminal) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String line = br.readLine(); // 標準入力から読み込む
			if(line == null || line.equals(terminal))break; // 行の終わり、もしくはterminalと一致した場合、終了
			dataSet.add(line); // 読み込んだ行をdataSetに追加
		}
	}
}

class Triangle{
	private int a, b, c;

	// 三角形の3辺をaが最大になるように入力する
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

		if(this.a < this.b) {
			int temp = this.a;
			this.a = this.b;
			this.b = temp;
		}

		if(this.a < this.c) {
			int temp = this.a;
			this.a = this.c;
			this.c = temp;
		}
	}

	// 三角形の種類を返すメソッド
	public int type(){
		if(a >= b + c)return -1; // 三角形にならない場合、-1を返す
		
		if(a * a == b * b + c * c) {
			return 0; // 直角三角形
		}

		if(a * a < b * b + c * c) {
			return 1; // 鋭角三角形
		}

		return 2; // 鈍角三角形
	}
}

