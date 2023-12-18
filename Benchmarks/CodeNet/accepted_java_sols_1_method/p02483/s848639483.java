import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] str = read.readLine().split(" ");
		int[] n = new int[3];
		for (int i = 0; i < 3; i++){
			n[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(n);
		System.out.println(n[0] + " " + n[1] + " " + n[2]);
	}
}