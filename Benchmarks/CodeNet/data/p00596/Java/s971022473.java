import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		try{
			while((str = br.readLine()) != null){
				// 最初はドミノの数が入力される
				int n = Integer.parseInt(str);

				// 次にはドミノが入力される
				int inputedDominoCount = 0;
				int valuesCount[] = new int[7];
				while(inputedDominoCount < n){
					str = br.readLine();
					int nowInputValuesCount[] = calcDomino(str);
					for(int i = 0; i < 7; i++){
						valuesCount[i] += nowInputValuesCount[i];
					}
					inputedDominoCount += nowInputValuesCount[7];
					//System.out.println("inputedDominoCount: " + inputedDominoCount);
				}
				//printArray(valuesCount);

				// 値のチェック
				int oddCount = 0;
				for(int i = 0; i < valuesCount.length; i++){
					if(valuesCount[i] % 2 == 1){
						oddCount++;
					}
				}
				if(oddCount <= 2){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
		}catch(Exception e){
			//System.err.println(e);
		}
	}

	static int[] calcDomino(String inputStr){
		int result[] = new int[8];
		for(int i = 0; i < inputStr.length(); i++){
			char pointingChar = inputStr.charAt(i);
			if(pointingChar == ' '){
			}else{
				result[Integer.parseInt("" + pointingChar)]++;
				result[7]++;
			}
		}
		result[7] = result[7] / 2;
		return result;
	}

	static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(i + ": " + array[i]);
		}
	}

	static int[][] parseDomino(String inputStr){
		int result[][] = new int[(inputStr.length() + 1)/3][2];
		for(int i = 0; i < inputStr.length(); i += 3){
			int x = Integer.parseInt("" + inputStr.charAt(i));
			int y = Integer.parseInt("" + inputStr.charAt(i+1));
		}
		return result;
	}
}