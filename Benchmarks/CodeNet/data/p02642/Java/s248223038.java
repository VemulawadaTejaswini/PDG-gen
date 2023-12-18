import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(list);
		int cnt = N;
		for(int i=0;i<N;i++){
			boolean found = false;	
			for(int j = 0;j<N;j++){
				if(i==j || found) continue;
				if(list[i]%list[j]==0){
				       	cnt--;
					found = true;
				} 
			}
		}
		System.out.println(cnt);		
	}
}
