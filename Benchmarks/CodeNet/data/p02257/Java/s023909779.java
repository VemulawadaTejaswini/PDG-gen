import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] array = new long[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		Prime pri = new Prime();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (pri.primeNumbers(array[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}

class Prime {
	long[] primeArray;
	public Prime(){
		primeArray = new long[10000];
		int primeCount = 0;
		boolean flag = true;
		for (int i = 2; primeCount < primeArray.length; i++) {
			flag = true;
			for (int j = 2; j <= (i / 2) + 1; j++) {
				if(i != j && i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag) {
				primeArray[primeCount++] = i;
			}
		}
	}
	public boolean primeNumbers(long x) {
		for (int i = 0; i < primeArray.length; i++) {
			if(primeArray[i] == x){
				return true;
			}
		}
		if(primeArray[primeArray.length - 1] >= x){
			return false;
		}
		for (int i = 0; i < primeArray.length; i++) {
			if(x != primeArray[i] && x % primeArray[i] == 0){
				return false;
			}
		}
		return true;
	}
}
