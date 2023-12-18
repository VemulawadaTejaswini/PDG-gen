import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	
	static Main byakko = new Main();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int n;
		boolean is;
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			is = true;
			
			for(int i = 0; i < n; i++){
				int x = sc.nextInt();
				if(map.containsKey(x)){
					map.put(x, map.get(x) + sc.nextInt() * sc.nextInt());
				}else{
					map.put(x, sc.nextInt() * sc.nextInt());
					list.add(x);
				}
			}
			for(int i = 0; i < list.size(); i++){
				if(map.get(list.get(i)) >= 1000000){
					System.out.println(list.get(i));
					is = false;
				}
			}
			if(is)
				System.out.println("NA");
		}
		sc.close();
	}
}