import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<>();
		while (sc.hasNext()) {
			inputList.add(sc.nextInt());
		}
		List<Integer> tmpList = new ArrayList<>();
		for (int tmp : inputList) {
			tmpList.add(tmp);
		}
		Collections.sort(tmpList);
		int max = tmpList.get(tmpList.size() - 1);
		boolean[] primeArray = new boolean[max + 1];
		Arrays.fill(primeArray, true);
		primeArray[0] = false;
		primeArray[1] = false;
		primeFalse(2, primeArray);
		for (int i = 3; i < primeArray.length;i+=2) {
			if(primeJudge(i)){
				primeFalse(i, primeArray);
			}
		}
		for (int n : inputList) {
			int count = 0;
			int primeNum = 0;
			do {
				primeNum = nextPrime(primeNum, primeArray);
				if (primeNum < 0 || primeNum > n) {
					break;
				} else {
					count++;
				}
			} while (true);
			System.out.println(count);
		}
	}
	
	public static boolean primeJudge(int n) {
		int a = (int)Math.sqrt(n) + 1;
		for (int i = 2; i < a; i++) {
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void primeFalse(int n, boolean[] array) {
		int tmp = n;
		while (tmp < array.length) {
			array[tmp] = false;
			tmp += n;
		}
		array[n] = true;
	}
	
	public static int nextPrime(int n, boolean[] array) {
		int tmp = n + 1;
		while (tmp < array.length) {
			if (array[tmp++]) {
				return --tmp;
			}
		}
		return -1;
	}
}

