import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	Scanner sc = new Scanner(System.in);
	LinkedList<String> stack;
	HashMap<String,HashSet<String> > map;
	String [] keys;
	HashSet<String>map0;
	
	private void doit(){
		
		keys = sc.nextLine().split("\\.");
		map0 = new HashSet<String>();
		stack = new LinkedList<String>();
		map = new HashMap<String, HashSet<String>>();
		mapping(0);
		check();
//		
//		//debug
//		for(int i = 0; i < keys.length; i++){
//			System.out.println("i=" + i + ":" + keys[i] + ".");
//		}
//		System.out.println(keys.length);
//		
//		//debug
//		for(String key: map.keySet()){
//			System.out.println("key=" + key +" "+ "valu="+map.get(key));
//		}
//		System.out.println();
		
	}
	
	

	private void check() {
		if(! map0.contains(keys[1])){
			System.out.println("no such property");
			return;
		}
		for(int i = 1; i < keys.length; i++){
			if(map.containsKey(keys[i])){
				if(i == 1) continue;
				HashSet<String> temp = map.get(keys[i-1]);
				if(temp.contains(keys[i])){
					
				}
				else{
					System.out.println("no such property");
					return;
				}
			}
			else{
				System.out.println("no such property");
				return;
			}
		}
		String now = keys[keys.length-1];
		HashSet<String> hs = map.get(now);
		if(hs.size() > 1){
			System.out.println("object");
		}
		else {
			String value = "";
			for(String s: hs){
				value = s;
			}
			if(map.containsKey(value) && ! value.equals(now)){
				System.out.println("object");
			}
			else{
				System.out.println("string \"" + value +"\"");
			}
		}
	}



	private HashSet<String> mapping(int n) {
		HashSet<String> res = new HashSet<String>();
		while(true){
			String line = gettoken();
			if(line == null) return res;
			int count = ci(line);
			if(count == n){
				String [] arr = line.split(":");
				String key = arr[0].trim();
				res.add(key);
				if(n == 0){
					map0.add(key);
				}
				mappingItem(n, line);
			}
			else{
				stack.add(line);
				return res;
			}
		}
	}



	private void mappingItem(int n, String line) {
		String [] arr = line.split(":");
		String key = arr[0].trim();
		if(arr.length == 1){
			String nline = gettoken();
			if(nline == null) return;
			int m = ci(nline);
			stack.add(nline);
			HashSet<String> value = mapping(m);
			map.put(key, value);
		}
		else{
			HashSet<String> value = new HashSet<String>();
			value.add(arr[1].substring(1));
			map.put(key, value);
		}
		
	}

	private String gettoken() {
		if(! stack.isEmpty()){
			return stack.removeLast();
		}
		if(sc.hasNext()){
			return sc.nextLine();
		}
		return null;
	}

	private int ci(String line) {
		int count = 0;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) != ' '){
				return count;
			}
			count++;
		}
		return -1;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}