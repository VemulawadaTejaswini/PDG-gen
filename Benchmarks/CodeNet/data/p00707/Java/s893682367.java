import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main{
	static char tiles[][];
	static String dstrs[][];
	static String max_str;

	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				// 縦と横を取得
				String strs[] = br.readLine().split(" ");
				int w = Integer.parseInt(strs[0]);
				if(w == 0) return;
				int h = Integer.parseInt(strs[1]);
				max_str = "0";


				// 配列を初期化
				tiles = new char[h][w];
				dstrs = new String[h][w];
				//System.out.println(h + " " + w);

				// 入力を配列に詰めていく
				for(int y = 0; y < h; y++){
					String str = br.readLine();
					for(int x = 0; x < w; x++){
						tiles[y][x] = str.charAt(x);
					}
				}
				//printMatrix(tiles);

				for(int y = 0; y < h; y++){
					for(int x = 0; x < w; x++){
						dp(x, y);
					}
				}
				//printMatrix(dstrs);
				System.out.println(max_str);
			}
		}catch(Exception e){
			System.err.print(e);
		}
	}

	static void dp(int x, int y){
		//System.out.println("計算: (" + x + ", " + y + ")");
		char target = tiles[y][x];
		if('0' <= target && target <= '9'){
			// 端だったらそのまま投入
			if(x == 0 && y == 0){
				dstrs[y][x] = "" + target;
			}else if(x == 0){
				dstrs[y][x] = dstrs[y-1][x] + target;
			}else if(y == 0){
				dstrs[y][x] = dstrs[y][x-1] + target;
			}else{
				dstrs[y][x] = max(dstrs[y-1][x], dstrs[y][x-1]) + target;
			}
			if(dstrs[y][x].equals("0")){
				dstrs[y][x] = "";
				return;
			}
			max_str = max(dstrs[y][x], max_str);
		}else{
			dstrs[y][x] = "";
		}
	}

	static String max(String str1, String str2){
		//System.out.println("大小比較: " + str1 + "\t" + str2);
		if(str1.length() == 0) return str2;
		if(str2.length() == 0) return str1;

		int length1 = str1.length();
		int length2 = str2.length();
		if(length1 > length2){
			return str1;
		}else if(length1 < length2){
			return str2;
		}
		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		if(num1.compareTo(num2) == 1){
			return str1;
		}else if(num1.compareTo(num2) == -1){
			return str2;
		}
		return str1;
	}

	static void printMatrix(char matrix[][]){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void printMatrix(String matrix[][]){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}