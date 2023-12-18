import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	String[] st = input.nextLine().split(" ");
    	int longest = 0;
    	Map<String,Integer> map = new HashMap<String,Integer>();
    	for(int i = 0 ; i < st.length ; i++){
    		longest = Math.max(longest, st[i].length());
    		if(!map.containsKey(st[i])){
    			map.put(st[i], 1);
    		}else{
    			int num = map.get(st[i])+1;
    			map.remove(st[i]);
    			map.put(st[i], num);
    		}
    	}
    	
    	Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    	Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
    	int most = 0;
    	String str = "";
    	String str2 = "";
    	while(it.hasNext()){
    		Map.Entry<String, Integer> entry = it.next();
    		String key = entry.getKey();
    		Integer value = entry.getValue();
    		if(most < value){
    			most = value;
    			str = key;
    		}
    		if(key.length() == longest)str2 = key;
    	}
    	System.out.println(str+" "+str2);
    }
}