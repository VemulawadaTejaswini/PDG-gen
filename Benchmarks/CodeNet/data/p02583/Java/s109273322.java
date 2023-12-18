import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = 1;
		//int t = Integer.parseInt(reader.readLine());
		for(int i1 = 0;i1<t;i1++){
			int p = Integer.parseInt(reader.readLine());
			int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(list);
			int ans = 0;
			for(int i = 0;i<list.length;i++){
				for(int j = i+1;j<list.length;j++){
					for(int k = j+1;k<list.length;k++){
						//System.out.println((list[i]!=list[j] && list[j]!=list[k] && list[i]!=list[k])+" "+list[i]+" "+list[j]+" "+list[k]);
						if(list[i]!=list[j] && list[j]!=list[k] && list[i]!=list[k] && list[i]+list[j] >list[k] ) ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}