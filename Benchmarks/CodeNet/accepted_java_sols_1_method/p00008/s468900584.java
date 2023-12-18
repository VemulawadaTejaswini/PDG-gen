import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=0; i<10; ++i){
			for(int j=0; j<10; ++j){
				if(!map.containsKey(i+j))
					map.put(i+j, 1);
				else
					map.put(i+j, map.get(i+j)+1);
			}
		}

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;

		try{
			while((str = bf.readLine()) != null){
				int ans = 0;
				int n = Integer.parseInt(str);
				for(Map.Entry<Integer, Integer> e : map.entrySet()){
					Integer v = map.get(n-e.getKey());
					ans += (v==null ? 0 : v) * e.getValue();
				}
				System.out.println(ans);
			}
		}
		catch(IOException ex){
			System.out.println(ex);
		}
	}
}