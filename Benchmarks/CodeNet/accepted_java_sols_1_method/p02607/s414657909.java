import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int res= 0;
		for(int i = 1;i<=n;i=i+2){
			if(list[i-1]%2==1) res++;
		}
		System.out.println(res);	
	}
}
