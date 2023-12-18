import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(list);
		int cnt = 0;
		int[] Seive_mod = new int[list[N-1]+1];
		for(int i=0;i<N;i++){
			for(int j = list[i];j<Seive_mod.length;j=j+list[i]){
				Seive_mod[j]+=1;
			}	
		}
		for(int i = 0;i<N;i++){
			if(Seive_mod[list[i]]==1) cnt++;
		}
		System.out.println(cnt);		
	}
}
