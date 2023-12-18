
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		TreeMap<String,List<Integer>> map=new TreeMap<>();
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			int odr=Integer.parseInt(in.next());
			
			switch(odr) {
			case 0:
				String key0=in.next();
				int x0=Integer.parseInt(in.next());
				List<Integer> ls0;
				if(map.containsKey(key0)) {
					ls0=map.get(key0);
					ls0.add(x0);
					map.put(key0,ls0);
				}
				else {
					ls0=new ArrayList<>();
					ls0.add(x0);
					map.put(key0, ls0);
				}
				break;
				
			case 1:
				String key1=in.next();
				if(map.containsKey(key1)) {
					List<Integer> ls1=map.get(key1);
					for(int j=0;j<ls1.size();j++)out.println(ls1.get(j));
				}
				break;
				
			case 2:
				String key2=in.next();
				map.remove(key2);
				break;
				
			case 3:
				String L=in.next(),R=in.next();
				NavigableMap<String,List<Integer>> sub=map.subMap(L, true, R, true);
				Iterator<NavigableMap.Entry<String,List<Integer>>> itr=sub.entrySet().iterator();
				while(itr.hasNext()) {
					NavigableMap.Entry<String,List<Integer>> entry=itr.next();
					List<Integer>ls3=entry.getValue();
					String key3=entry.getKey();
					for(int j=0;j<ls3.size();j++) {
						out.println(key3+" "+ls3.get(j));
					}
				}
				break;
			}
		}
		out.flush();
	}

}
