import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer[] hills = new Integer[10];
		for(int i=0;i<10;i++)
			hills[i]=Integer.parseInt(in.readLine());
		Arrays.sort(hills, Collections.reverseOrder());
		for(int i=0;i<3;i++)
			System.out.println(hills[i]);
	}
}