import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		SortedMap<String, ArrayList<Integer>> mpa = new TreeMap<String, ArrayList<Integer>>();
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int op = Integer.parseInt(str[0]);
			if(op == 0){
				String key = str[1];
				int x = Integer.parseInt(str[2]);
				if(mpa.get(key) == null){
					mpa.put(key, new ArrayList<Integer>());
				}
				mpa.get(key).add(x);
			}else if(op == 1){
				String key = str[1];
				if(mpa.get(key) == null) continue;
				Iterator<Integer> it = mpa.get(key).iterator();
				while(it.hasNext()) System.out.println(it.next());
			}else if(op == 2){
				String key = str[1];
				if(mpa.get(key) == null) continue;
				mpa.get(key).clear();
			}else{
				String L = str[1];
				String R = str[2] + "#";
				SortedMap<String, ArrayList<Integer>> mpb = mpa.subMap(L, R);
				for(String s : mpb.keySet()){
					for(Integer num : mpb.get(s)) System.out.println(s + " " + num);
				}
			}
		}
	}
}

