import java.util.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HashMap<String,HashMap<Integer,Integer>> hm = new HashMap<>();
		List<String> citys = new ArrayList<>();
		for(int i=1;i<=num;i++) {
		    String city = sc.next();
		    
		    
		    if(hm.containsKey(city)){
		        HashMap<Integer,Integer> hmap = hm.get(city);
		        hmap.put(sc.nextInt(), i);
		        hm.remove(city);
		        hm.put(city,hmap);
		    } else {
		        citys.add(city);
		        
		        HashMap<Integer,Integer> hmap = new HashMap<>();
		        hmap.put(sc.nextInt(), i);
		        hm.put(city,hmap);
		    }
		}
		
		Collections.sort(citys);
		int cityNum = citys.size();
		
		for (int i=0;i<cityNum;i++) {
		    String city = citys.get(i);
		    HashMap<Integer,Integer> hmap = hm.get(city);
		    Object[] mapkey = hmap.keySet().toArray();
            Arrays.sort(mapkey);
            int count = mapkey.length;
        
            for (int j=1;j<=count;j++){
                int n = (Integer)mapkey[count-j];
                System.out.println(hmap.get(n));
		    }
		}
		
	}
}