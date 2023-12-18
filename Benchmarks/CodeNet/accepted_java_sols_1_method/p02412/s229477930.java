
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			int[][] intNX = new int[50][2];
			int intLength =0;
			for(int i =  0; true; i++){
				String[] strLine = insBR.readLine().split(" ");
				if(!"0".equals(strLine[0]) || !"0".equals(strLine[1])){
					for(int j = 0; j < strLine.length; j++){
						intNX[i][j] = (Integer.parseInt(strLine[j]));
					}
				}else{
					break;
				}
				intLength++;
			}

			int intSum = 0;
			int[] intCount = new int[intLength];

			for(int h = 0; h < intLength; h++){
				for(int i = 1; i <= intNX[h][0] - 2; i++){
					for(int j = i + 1; i < j && j <= intNX[h][0] - 1; j++){
						for(int k = j + 1; j < k && k <= intNX[h][0]; k++){
							if(i != j && j != k && k != i){
								intSum = i + j + k;
								if(intSum == intNX[h][1]){
									intCount[h]++;
								}
							}
						}
					}
				}
			}



			for(int i = 0; i < intCount.length; i++){
				System.out.println(intCount[i]);
			}

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}

