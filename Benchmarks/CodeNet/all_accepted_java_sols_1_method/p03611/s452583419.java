import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] pos = new int[1000005];
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (x>0) pos[x-1]++;
			pos[x]++;
			pos[x+1]++;
		}
		Arrays.sort(pos);
		System.out.println(pos[pos.length-1]);
	}
}