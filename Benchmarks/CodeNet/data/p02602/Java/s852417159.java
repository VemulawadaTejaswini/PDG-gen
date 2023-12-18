
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] lo = reader.readLine().split(" ");
		int n = Integer.parseInt(lo[0]);
		int k = Integer.parseInt(lo[1]);	
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		for(int i = k;i<n;i++){
			if(list[i]>list[i-k]) writer.write("Yes"+"\n");
			else writer.write("No"+"\n");
		}
		writer.flush();
	}
}
