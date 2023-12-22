import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt(), q = sc.nextInt();
		String s = sc.next();
		
		int[] pSum = new int[length];
		
		for (int i = 1; i < length; i++) {
			pSum[i] = pSum[i - 1];
			if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') pSum[i]++;
		}
		
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt() - 1, r = sc.nextInt() - 1;
			
			if (l == 0) System.out.println(pSum[r]);
			else System.out.println(pSum[r] - pSum[l]);
		}
		

	}
}