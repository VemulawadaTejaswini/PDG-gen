import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		String str;
		
		while(sc.hasNext()){
			str = sc.next();
			
			int x = Integer.parseInt(str.split(",",0)[0]);
			if(map.containsKey(x)){
				map.put(x, map.get(x) + 1);
			}else{
				map.put(x, 1);
			}
			if(!list.contains(x))
				list.add(x);
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++){
			System.out.println(map.get(list.get(i)));
		}
		sc.close();
	}
}