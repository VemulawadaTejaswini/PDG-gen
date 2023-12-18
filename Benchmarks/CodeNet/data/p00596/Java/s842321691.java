import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		new Main().dominoesArrangement();
	}

	int values[];
	int inputedDominoCount;
	int maxDominoCount;
	int maxValue;
	int minValue;
	boolean isExistDomino[][];
	boolean isConnected[];

	public void dominoesArrangement(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		try{
			while((str = br.readLine()) != null){
				// 最初はドミノの数が入力される
				maxDominoCount = Integer.parseInt(str);

				// 初期化
				values = new int[7];
				inputedDominoCount = 0;
				isExistDomino = new boolean[7][7];
				isConnected = new boolean[7];

				while(inputedDominoCount < maxDominoCount){
					try{
						str = br.readLine();
					}catch(Exception e){}
					parseDomino(str);
					//System.out.println("inputedDominoCount: " + inputedDominoCount);
				}
				//printArray(values);
				//printArray(isExistDomino);


				// 最小値を求める
				for(minValue = 0; minValue < values.length; minValue++){
					if(values[minValue] != 0) break;
				}
				//System.out.println("最小値:" + minValue);

				// ノードの偶奇チェック
				// ついでに最小値も求める
				int oddCount = 0;
				for(int i = minValue; i < values.length; i++){
					if(values[i] % 2 == 1) oddCount++;
				}
				// 奇数のノードが2より多かったらまず無理
				if(oddCount > 2){
					System.out.println("No");
					continue;
				}

				// 最小値から深さ優先探索
				serch(minValue);
				//printArray(isConnected);

				// 行きたいノードがちゃんと全部接続されているか
				boolean noFlag = false;
				for(int i = minValue; i < values.length; i++){
					if(values[i] != 0){
						//System.out.println(i + ": 値が0でない");
						if(!isConnected[i]){
							noFlag = true;
							break;
						}
					}
				}
				if(noFlag){
					System.out.println("No");
					continue;
				}

				System.out.println("Yes");
			}
		}catch(Exception e){
			//System.err.println(e);
		}
	}

	void parseDomino(String inputStr){
		for(int i = 0; i < inputStr.length(); i++){
			int counter = 0;
			if(inputStr.charAt(i) == ' '){
				// 空白はスルー
			}else{
				int x = Integer.parseInt("" + inputStr.charAt(i));
				int y = Integer.parseInt("" + inputStr.charAt(i+1));
				i++;
				values[x]++;
				values[y]++;
				isExistDomino[x][y] = true;
				isExistDomino[y][x] = true;
				inputedDominoCount++;
			}
		}
	}

	void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(i + ": " + array[i]);
		}
	}

	void printArray(boolean[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(i + ": " + array[i]);
		}
	}

	void printArray(boolean[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	void serch(int n){
		if(isConnected[n]) return;
		// System.out.println(n + "を探索");
		isConnected[n] = true;
		for(int i = 0; i <= 6; i++){
			if(i == n) continue;
			if(isExistDomino[n][i])
				serch(i);
		}
	}
}