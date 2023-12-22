import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
				int n = Integer.parseInt(reader.readLine());
				int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();					
				int p = 0;
				for(int i =0;i<n;i++) p=p^list[i];
				StringBuilder s = new StringBuilder("");
				for(int i = 0;i<n;i++){
					s.append((p^list[i])).append(" ");
				}
				System.out.println(s.toString());
	}
}
