import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			String[] s = br.readLine().split(" ");

			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			int ans = -1;

			for(int i=0;i<n;i++){
				int x = Integer.parseInt(s[i]);
				if(map.get(x) == null) map.put(x,0);
				int time = map.get(x) + 1;
				if(time > n / 2) ans = x;
				map.put(x,time);
			}

			System.out.println(ans==-1 ? "NO COLOR" : ans);
		}
	}
}