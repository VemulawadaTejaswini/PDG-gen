import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			HashMap<String, HashSet<String>> groups = new HashMap<String, HashSet<String>>();
			
			String first_key = null;
			
			for(int i = 0; i < n; i++){
				String[] in = sc.next().split(":");
				String[] press = in[1].split("[,.]");
				
				if(i == 0){
					first_key = in[0];
				}
				
				HashSet<String> set = new HashSet<String>();
				for(String str : press){
					if("".equals(str)){
						continue;
					}
					set.add(str);
				}
				
				groups.put(in[0], set);
			}
			
			HashSet<String> counting = new HashSet<String>(groups.get(first_key));
			
			LinkedList<String> put = new LinkedList<String>();
			while(true){
				boolean mod = false;
				put.clear();
				
				for(Iterator<String> iter = counting.iterator(); iter.hasNext(); ){
					String in = iter.next();
					
					if(groups.containsKey(in)){
						mod = true;
						iter.remove();
						for(String str : groups.get(in)){
							put.add(str);
						}
					}
				}
				
				if(!mod){
					break;
				}else{
					counting.addAll(put);
				}
			}
			
			System.out.println(counting.size());
		}
		
	}

}