//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		printPrimeNumbers2(1000000);
		for(int i=X;i<=1000000;i++) {
			if(targetNumbers[i]) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}
	public static void printPrimeNumbers2(int maxNumber) {
		targetNumbers = new boolean[maxNumber + 1];
	    Arrays.fill(targetNumbers, true);
	    targetNumbers[0] = false;
	    targetNumbers[1] = false;
	    // 素数リスト
	    List<Integer> primeNumbers = new ArrayList<Integer>();

	    int sqrt = (int) Math.sqrt(maxNumber);

	    // ステップ3：探索リストの先頭の値が、引数の平方根に達するまでふるい落とし操作を続ける。
	    for(int i=2; i<=sqrt; i++) {
	        // ステップ2：探索リストの先頭の数を素数とし、その倍数を探索リストから篩い落とす。
	        // ※この時、既に篩い落とされた数（false）は除外する。
	        //int firstNum = i;
	        if (targetNumbers[i]) {
	            for (int j=2;i*j<=maxNumber;j++) {
	                targetNumbers[i*j] = false;
	            }
	        }
	    }

	    // ステップ4：探索リストに残った値を素数リストに移して処理終了。
	    for (int i=2; i<targetNumbers.length; i++) {
	        if (targetNumbers[i]) {
	            primeNumbers.add(i);
	        }
	    }

	    // 素数の表示
//	    int size = primeNumbers.size();
//	    for(int i = 0; i < size; i++)
//	    {
//	        Integer value = primeNumbers.get(i);
//	        System.out.println(value);
//	    }
	    
	     
	}
	
}