import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		while(true){
			String[] input = br.readLine().split(" ");
			int numNumbers = Integer.parseInt(input[0]);
			int sum = Integer.parseInt(input[1]);
			if(numNumbers == 0 && sum == 0)	break;
			int numCombinations = 0;
//				System.out.println(base + ":" + numCombinations);
			numCombinations += getCombinations(numNumbers, sum);
			System.out.println(numCombinations);
		}
	}
	/**
	 * 指定された個数で指定された和になる組み合わせの数を求める
	 * @param numNumbers	数の個数
	 * @param sum			求める和
	 * @param min			使う最小値
	 * @return				組み合わせの数
	 */
	public static int getCombinations(int numNumbers, int sum, int min){
		if(sum < min || numNumbers <= 0)	return 0;
		else if(numNumbers == 1)	return (min <= sum && sum <= 9) ? 1 : 0;
		int combinations = 0;
		for(int value = min; value <= 9; value++){
			combinations += getCombinations(numNumbers - 1, sum - value, value + 1);
		}
		return combinations;
	}
	public static int getCombinations(int numNumbers, int sum){
		return getCombinations(numNumbers, sum, 0);
	}
}