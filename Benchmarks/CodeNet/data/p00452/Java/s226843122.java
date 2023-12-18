import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			int[] input = new int[n];
			
			for(int i = 0; i < n ; i++){
				input[i] = sc.nextInt();
			}
			
			System.out.println(solve(input, m));
		}
	}
	
	//半分全列挙で解きたい
	static long solve(int[] array, int limit){
		int n = array.length + 1;
		int[] copyArray = new int[n];
		//0を追加した配列を作る
		for(int i = 0 ; i < n - 1; i++){
			copyArray[i] = array[i];
		}
		
		//2回投げたときに有り得る得点
		long[] twoTimes = new long[n*n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				twoTimes[i * n + j] = copyArray[i] + copyArray[j];
			}
		}
		
		Arrays.sort(twoTimes);
		//debug
//		for(int i = 0; i < twoTimes.length; i++){
//			System.out.println(twoTimes[i]);
//		}
		
		long result = 0;
		
		for(int i = 0; i < twoTimes.length ; i++){
			//そもそも2回だけで済む場合
			if(twoTimes[i] == limit){
				return twoTimes[i];
			}
			
			//既にオーバーしている場合も論外
			else if (twoTimes[i] > limit){
				break;
			}
			
			//わざと少し下を狙う
			int tmpIndex = Arrays.binarySearch(twoTimes, limit - twoTimes[i] - 1);
			
			if(tmpIndex < 0){
				tmpIndex++;
				tmpIndex *= -1;
//				tmpIndex--;
			}
			
			if(tmpIndex >= twoTimes.length){
				tmpIndex = twoTimes.length - 1;
			}
			
			
			for(int j = tmpIndex; j < twoTimes.length; j++){
				if(twoTimes[i] + twoTimes[j] > limit){
					break;
				}
//				System.out.println("j = "+j+" "+twoTimes[i] + " "+twoTimes[j]);
				result = Math.max(result, twoTimes[i] + twoTimes[j]);
			}
		}
		return result;
	}

}

