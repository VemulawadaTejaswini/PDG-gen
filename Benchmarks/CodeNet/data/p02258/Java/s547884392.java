import java.awt.List;
import java.io.*;
import java.util.*;

public class Main {
	public static int minn(int i, int j) {
		if(i > j) {
			return j;
		}
		else {
			return i;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		int[] k = new int[times];
		
		for(int i = 0; i < times; i++) {
			k[i] = in.nextInt();
		}
		int min = k[0];
		int max = Integer.MIN_VALUE;
		for(int j = 1; j <times; j++) {
			if(k[j] - min > max) {
				max = k[j] - min;
			}
			min = minn(k[j], min);
		}
		System.out.println(max);
		
	}
}


