import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int[][] resultList = new int[10][10];
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//標準入力から値の読み込み
		String str = in.readLine();
		//入力さた行数分インクを落とす
		while (str != null) {
			if("".equals(str)) break;
			String[] strList =str.split(",");
			int row = Integer.parseInt(strList[0]);
			int colum = Integer.parseInt(strList[1]);
			int size =  Integer.parseInt(strList[2]);
			str = in.readLine();
			switch(size){
			case  1:
				smallDrop(row,colum);
				break;
			case  2:
				middleDrop(row,colum);
				break;
			case  3:
				largeDrop(row,colum);
				break;
			}
		}

		//結果の出力
		reult(resultList);
	}
	//インク小
	static void smallDrop(int row,int colum){
		resultList[row][colum] =+ 1;
		if(colum < 9) resultList[row][colum + 1]++;
		if(row < 9) resultList[row + 1][colum]++;
		if(colum > 0) resultList[row][colum - 1]++;
		if(row > 0)resultList[row -1][colum]++;
	}

	//インク中
	static void middleDrop(int row,int colum){
		smallDrop(row,colum);
		if(row < 9 && colum < 9) resultList[row + 1][colum + 1]++;
		if(row < 9 && colum > 0) resultList[row + 1][colum - 1]++;
		if(row > 0 && colum > 0) resultList[row - 1][colum - 1]++;
		if(row > 0 && colum < 9) resultList[row - 1][colum + 1]++;
	}

	//インク大
	static void largeDrop(int row,int colum){
		middleDrop(row,colum);
		if(colum < 8) resultList[row][colum + 2]++;
		if(row < 8) resultList[row + 2][colum]++;
		if(colum > 1) resultList[row][colum - 2]++;
		if(row > 1)resultList[row -2][colum]++;
	}

	//結果出力用
	//色のついていない部分のマス目の個数第１行目に、
	//１番濃いマス目の濃さを第２行目に出力
	static void reult(int[][] resultList){
		//色のついていない部分のマス目
		int  cleanSquares = 0;
		//１番濃いマス目の濃さ
		int depth = 0;

		//色のついていない部分のマス目と１番濃いマス目の濃さを調べる
		for(int i =0 ; resultList.length > i ;  i++){
			for(int j = 0 ; resultList[i].length > j ; j++){
				if(depth < resultList[i][j]) depth = resultList[i][j];
				else if(resultList[i][j] == 0) cleanSquares++;
			}
		}

		//結果を出力
		System.out.println(cleanSquares);
		System.out.println(depth);
	}

}