import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		Set<Integer> S = new TreeSet<Integer>();
		for(int i = 0; i < n; i++){
			S.add(Integer.parseInt(str[i]));
		}
		int m = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		for(int i = 0; i < m; i++){
			S.remove(Integer.parseInt(str[i]));
		}
		for(Integer num : S) System.out.println(num);
	}
}

