import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		int[] a = new int[4];
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 'K') a[0]++;
			if(in[i] == 'U') a[1]++;
			if(in[i] == 'P') a[2]++;
			if(in[i] == 'C') a[3]++;
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		
		
		
		
		
	}
}