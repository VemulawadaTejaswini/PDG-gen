import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		while (true){
			String[] str = read.readLine().split(" ");
			int[] n = new int[2];
			
			n[0] = Integer.parseInt(str[0]);
			n[1] = Integer.parseInt(str[1]);
			if (n[0] == 0 && n[1] == 0){
				break;
			}
			Arrays.sort(n);
			System.out.println(n[0] + " " + n[1]);
		}
	}
}