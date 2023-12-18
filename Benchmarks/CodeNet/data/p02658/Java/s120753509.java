import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		long count = sc.nextInt();
		long max = (long)Math.pow(10, 18);
		long inputNum[] = new long[count];
		BigInteger result = BigInteger.ZERO;
		
		for(i=0;i<count;i++){
			inputNum[i] = sc.nextLong();
		}
		
		for(long num : inputNum){
			if(result != BigInteger.ZERO){
				result.add(num);
			}else{
				result.multiply(num);
			}
		}
		
		if(result.compareTo(BigInteger.valueOf(max)) == 1) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
	}
}