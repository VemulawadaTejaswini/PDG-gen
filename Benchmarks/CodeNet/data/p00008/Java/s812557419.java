import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=1; i<10; ++i){
			for(int j=1; j<10; ++j){
				if(!map.containsKey(i+j))
					map.put(i+j, 1);
				else
					map.put(i+j, map.get(i+j)+1);
			}
		}

		int ans = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try{
			int n = Integer.parseInt(bf.readLine());
			for(Map.Entry<Integer, Integer> e : map.entrySet()){
				Integer v = map.get(n-e.getKey());
				ans += (v==null ? 0 : v) * e.getValue();
			}
		}
		catch(IOException ex){
			System.out.println(ex);
		}

		System.out.println(ans);
	}
}