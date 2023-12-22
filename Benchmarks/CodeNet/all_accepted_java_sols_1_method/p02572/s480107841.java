import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt(), zeroCount = 0;
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = reader.nextInt();
			if (arr2[i] == 0) {
				zeroCount++;
			}
		}
		int[] arr = new int[n - zeroCount];
		if (arr.length < 2) {
			System.out.println(0);
		}
		else {
			int encountered = 0;
			for (int i = 0; i < arr2.length; i++) {
				if (arr2[i] == 0) {
					encountered++;
				}
				else {
					arr[i - encountered] = arr2[i];
				}
			}
			long ret = 0;
			BigInteger modThing = new BigInteger("" + ((int) Math.pow(10, 9) + 7));
			BigInteger prev = (new BigInteger("" + arr[arr.length - 2])).multiply(new BigInteger("" + arr[arr.length - 1]));
			BigInteger fakePrev = new BigInteger("0");
			ret += prev.mod(modThing).intValue();
			ret %= Math.pow(10, 9) + 7;
			for (int i = arr.length - 3; i >= 0; i--) {
				BigInteger single = (new BigInteger("" + arr[i])).multiply(new BigInteger("" + arr[i + 1]));
				BigInteger newOne = prev.multiply(new BigInteger("" + arr[i])).divide(new BigInteger("" + arr[i + 1]));
				prev = single.add(newOne);
				ret += prev.mod(modThing).intValue();
				ret %= Math.pow(10, 9) + 7;
			}
			
			System.out.println(ret);
		}
		reader.close();
	}
	
}
