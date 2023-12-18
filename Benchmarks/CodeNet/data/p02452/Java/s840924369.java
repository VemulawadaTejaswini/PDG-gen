import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int[] a = new int[n];
		str = br.readLine().split(" ");
		for(int i = 0; i < n; i++) a[i] = Integer.parseInt(str[i]);
		str = br.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		str = br.readLine().split(" ");
		boolean flag = true;
		for(int i = 0; i < m; i++){
			int b = Integer.parseInt(str[i]);
			if(Arrays.binarySearch(a, b) < 0) flag = false;
		}
		if(flag) System.out.println(1);
		else System.out.println(0);
	}
}

