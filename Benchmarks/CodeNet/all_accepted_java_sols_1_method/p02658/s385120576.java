import java.io.*;
import java.util.*;
public class Main{
	public static long INF = (long)1e18;
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		for(int i = 0;i<n;i++){
			if(list[i]==0L){
				System.out.println(0);
				return;
			}
		}
		long res = 1;
		for(int i = 0;i<n;i++){
			if(INF/res < list[i]){
				System.out.println(-1);
				return;
			}
			else res*=list[i];
		}
		System.out.println(res);
	}
}
