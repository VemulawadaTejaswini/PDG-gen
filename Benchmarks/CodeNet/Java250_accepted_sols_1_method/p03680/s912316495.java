import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in), 1);
	    int n = Integer.parseInt(rd.readLine());
	    //String[] sl = s.split(" ");
		int a[] = new int[123456];
		for(int i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(rd.readLine());
		}
		
		int c = 1;
		for(int i = 1; i <= 100001; i++)
		{
			c = a[c];
			if(c == 2)
			{
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(-1);
		
  	}
}