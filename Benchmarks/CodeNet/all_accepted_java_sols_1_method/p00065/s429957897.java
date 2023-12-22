import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer,Integer> cur_map = new HashMap<Integer,Integer>();
		Map<Integer,Integer> pre_map = new HashMap<Integer,Integer>();
		String str;
		
		while((str = br.readLine()) != null && !(str.equals(""))){
			int com = Integer.parseInt(str.substring(0,str.indexOf(",")));
			if(cur_map.get(com) == null){
				cur_map.put(com, 1);
			}else{
				cur_map.put(com, cur_map.get(com)+1);
			}
		}
		
		while((str = br.readLine()) != null && !(str.equals(""))){
			int com = Integer.parseInt(str.substring(0,str.indexOf(",")));
			if(pre_map.get(com) == null){
				pre_map.put(com, 1);
			}else{
				pre_map.put(com, pre_map.get(com)+1);
			}
		}
		
		for(int c_com:new TreeSet<Integer>(cur_map.keySet())){
			if(pre_map.containsKey(c_com)){
				System.out.println("" + c_com + " " + (cur_map.get(c_com) + pre_map.get(c_com)));
			}
		}
		
	}
}