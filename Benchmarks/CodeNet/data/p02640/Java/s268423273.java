import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		for(int i = 0;i<5;i++){
			sum += list[i];
		}
		System.out.println(15-sum);		
	}
}
