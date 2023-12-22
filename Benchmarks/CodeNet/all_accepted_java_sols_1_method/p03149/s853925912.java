import java.io.*;

import java.text.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		final int len = 4;
		int[] array = new int[len];
		int[] suc = {1,4,7,9};
		String msg = "NO";
		
		for (int i = 0; i < len; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		
		for (int i = 0; i < len; i++) {
			if (array[i] != suc[i]) {
				break;
			}
			if (i == len - 1) {
				msg = "YES";
			}
		}
		System.out.println(msg);
	}

}
