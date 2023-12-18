
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int maxNumber = Integer.parseInt(br.readLine());
			if(maxNumber == 0)	break;
			System.out.println(getSumOfPrimeNumbers(maxNumber));
		}
	}
	public static int getSumOfPrimeNumbers(int maxNumber){
		int sum = 0;
		ArrayList<Integer> primeNumber = getPrimeNumbers(maxNumber);
		for(Integer i : primeNumber){
			sum += (int)i;
		}
		return sum;
	}
	private static ArrayList<Integer> getPrimeNumbers(int maxNumber){
		ArrayList<Integer> primeNumber = new ArrayList<Integer>();
		for(int i = 2; i < maxNumber + 1; i++){
			if( isPrimeNumber(i)) primeNumber.add(i);
		}
		return primeNumber;
	}
	private static boolean isPrimeNumber(int target){
		if( target == 2 )	return true;
		if( target % 2 == 0 )	return false;
		for(int i = 3; i * i < target + 1; i = i + 2){
			if( target % i == 0){
				return false;
			}
		}
		return true;
	}
}