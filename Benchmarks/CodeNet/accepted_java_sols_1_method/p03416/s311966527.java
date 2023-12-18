import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int A = in.nextInt(), B = in.nextInt();
			int cnt = 0;

			for(int i = A; i <= B; i++)
			{
				String val = String.valueOf(i);
				String str = "";
				for(int j = val.length() - 1; j >= 0; j--)
					str += val.charAt(j) + "";

				if(val.equals(str))
					cnt++;
			}
			System.out.println(cnt);
	}
    
}