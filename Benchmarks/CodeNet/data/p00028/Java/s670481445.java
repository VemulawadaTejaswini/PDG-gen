import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		ArrayList<Integer> list=new ArrayList<Integer>();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		while(scan.hasNext()){
			int x=scan.nextInt();
			if(map.containsKey(x)){
				map.put(x, map.get(x)+1);
			}else{
				map.put(x, 1);
			}
		}
		
		int max=0;
		int len=map.size();
		for (Map.Entry<Integer, Integer> val: map.entrySet()) {
			
			if(val.getValue()>=max){
				max=Math.max(max, val.getValue());
				list.add(val.getKey());
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}