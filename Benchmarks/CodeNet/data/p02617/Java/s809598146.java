
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int ans = 0;
		
		for(int i = 1; i < n + 1; i++)
			ans += i * (n - i + 1);
		
		for(int i = 0; i < n - 1; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			if(a > b) 
			{
				int temp = a;
				a = b;
				b = temp;
			}
			ans -= a * (n - b + 1);
		}
		
		System.out.println(ans);

	}

}
