import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int price = Integer.parseInt(br.readLine());
			
			if(price == 0){
				break;
			}
			
			int[] result = new int[5001];
			result[200] = 380; result[400] = 760;
			result[300] = 550;
			result[500] = 850;
			result[100] = 10000000;
			for(int i = 600 ; i <= price ; i+= 100){
				int[] tmpArray = new int[6];
				Arrays.fill(tmpArray, Integer.MAX_VALUE);
				//A??§???????????????
				tmpArray[0] = result[i - 200] + 380;
				//B??§???????????????
				tmpArray[1] = result[i - 300] + 550;
				//C??§???????????????
//				if(result[i - 500] > 0){
				tmpArray[2] = result[i - 500] + 850;
//				}
				//A??§????????§??????
				if(i - 1000 >= 0){
					tmpArray[3] = result[i - 1000] + 1520;
				}
				//B??§????????§??????
				if(i - 1200 >= 0){
					tmpArray[4] = result[i - 1200] + 1870;
				}
				//C??§????????§??????
				if(i - 1500 >= 0){
					tmpArray[5] = result[i - 1500] + 2244;
				}
				
				result[i] = minInArray(tmpArray);
			}
			System.out.println(result[price]);
		}
	}
	
	static int minInArray(int[] array){
		int tmp = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length ; i++){
			if(tmp > array[i]){
				tmp = array[i];
			}
		}
		
		return tmp;
	}

}