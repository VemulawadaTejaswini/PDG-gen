import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[10];
		
		String s;
		for(int i=0;i<10;i++)
				a[i] = Integer.parseInt(br.readLine());

		Arrays.sort(a);
		
		System.out.println(a[9]);
		System.out.println(a[8]);
		System.out.println(a[7]);
		
	}
}