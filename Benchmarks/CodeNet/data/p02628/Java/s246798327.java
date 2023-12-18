import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
			String[] lo = reader.readLine().split(" ");
			int k = Integer.parseInt(lo[1]);
			int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(list);
			int sum = 0;
			for(int i = 0;i<k;i++) sum+=list[i];
			System.out.println(sum);
	}
}
