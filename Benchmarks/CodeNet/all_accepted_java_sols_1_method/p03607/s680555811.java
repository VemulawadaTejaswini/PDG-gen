import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in), 1);
		HashSet<Integer> s = new HashSet<>();
		int n = Integer.parseInt(rd.readLine());
	    //String[] sl = s.split(" ");
		for(int i = 1; i <= n; i++)
		{
			int a = Integer.parseInt(rd.readLine());
			if(s.contains(a))
			{
				s.remove(a);
			}
			else
			{
				s.add(a);
			}
		}
		System.out.println(s.size());
		
  	}
}