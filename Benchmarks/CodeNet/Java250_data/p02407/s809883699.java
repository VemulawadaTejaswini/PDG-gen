import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] intArray = convertInt(br.readLine().split(" "));
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(intArray[i]);
			if (i != 0) {
				System.out.print(" ");
			} else if (i == 0) {
				System.out.println("");
			}
		}
	}

	private static int[] convertInt(String[] strArray) {
		int len = strArray.length;
		int[] intArray = new int[len];
		for (int i = 0; i < len; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}