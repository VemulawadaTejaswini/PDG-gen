import java.util.Scanner;

//listを配列に変更したバージョン

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int spaceNum = sc.nextInt();
		int dollTypeNum = sc.nextInt();
		int space[] = new int[spaceNum];  //棚の初期状態
		int dollType[] = new int[dollTypeNum];  //ぬいぐるみが種類ごとにいくつあるか(添え字に注意)
		int cursor = 0;
		int count = 0;

		int flag[] = new int[dollTypeNum];  //ぬいぐるみの種類ごとに使用したかどうかを判定するフラグ

		for(int i = 0; i < spaceNum; i++) {
			space[i] = sc.nextInt();
			for(int j = 1; j <= dollTypeNum; j++) {
				if(space[i] == j) {
					dollType[j - 1]++;
					break;
				}
			}
		}
		////////////////////////////////////////////////////////////////////ここまではOK

		for(int i = 0; i < dollTypeNum; i++) {
			FillIn2 fi = new FillIn2();
			fi.fill_in(cursor, space, flag, dollType);
			cursor += dollType[fi.getNum() - 1];
			count += fi.getMin();

			flag[fi.getNum() - 1] = 1;
		}

		System.out.println(count);
	}
}

class FillIn2 {
	private int num = 0;
	private int min = Integer.MAX_VALUE;
	//最小の操作回数で埋められるぬいぐるみ番号を探すメソッド
	/*  fill_in_in_order(埋める開始点, 操作前のぬいぐるみ配列, 埋め終わってないぬいぐるみ番号を入れたリスト,
	ぬいぐるみ番号別の個数を入れた配列);  */
	public void fill_in(int start, int[] array, int[] flag, int[] type) {
		int cursor;
		int count = 0;
		for(int i = 0; i < flag.length; i++) {  //埋め終わってないぬいぐるみ番号のループ
			cursor = start;
			count = 0;
			if(flag[i] == 0) {
				for(int j = 0; j < type[i]; j++) {  //その番号のぬいぐるみの個数のループ
					if(array[cursor] == i + 1) count++;
					cursor++;
				}
				if(type[i] - count < min) {
					//iのforループを回してここで求めたnumが最小操作回数で埋められるぬいぐるみ番号、minがその操作回数
					num = i + 1;
					min = type[i] - count;
				}
			}
		}
	}

	public int getNum() {
		return this.num;
	}

	public int getMin() {
		return this.min;
	}

}

