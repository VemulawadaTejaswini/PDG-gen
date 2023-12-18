import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		long max = (long)Math.pow(10, 18);
		long inputNum[] = new long[count];
		BigInteger result = BigInteger.ZERO;
		
		for(int i = 0;i < count;i++){
			inputNum[i] = sc.nextLong();
		}
		
		for(long num : inputNum){
			if(result.compareTo(BigInteger.ZERO) == -1){
				result.add(BigInteger.valueOf(num));
			}else{
				result.multiply(BigInteger.valueOf(num));
			}
		}
		
		if(result.compareTo(BigInteger.valueOf(max)) == 1) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
	}
}