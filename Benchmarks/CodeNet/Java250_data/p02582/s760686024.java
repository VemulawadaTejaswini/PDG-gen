import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Main {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		char arr[] = string.toCharArray();
		int r = 0;//2
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='R') {
				r++;
			}else {
				if (max<r) {
					max = r;
					r = 0;
				}else {
					r = 0;
				}
			}
		}
		if (max<r) {
			System.out.println(r);
		}else {
		System.out.println(max);
		}
	}

}