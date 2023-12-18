import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Main {

	final int MIN_NUMBERS = 1;
	final int MAX_NUMBERS = 5000;
	
	final int MIN_NUM = -100000;
	final int MAX_NUM = 100000;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			//項数を取得
			int numbers = Integer.parseInt(br.readLine());
			if(numbers == 0)	break;
			//各項に数字を代入
			int[] n = new int[numbers];
			for(int i = 0; i < numbers; i++){
				n[i] = Integer.parseInt(br.readLine());
			}
			//連続した項の和の最大値を出力
			System.out.println(getMaxSumSequence(n));
		}
	}
	public static long getMaxSumSequence(int[] n){
		long maxSum = 0;
		for(int source = 0; source < n.length; source++){
			long tmpSum = (long)n[source];
			maxSum = Math.max(maxSum, tmpSum);
			for(int target = source + 1; target < n.length; target++){
				tmpSum += (long)n[target];
				maxSum = Math.max(maxSum, tmpSum);
			}
		}
		return maxSum;
	}
}