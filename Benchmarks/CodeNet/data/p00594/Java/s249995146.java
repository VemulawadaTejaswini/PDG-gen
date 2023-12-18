import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		while((n = scan.nextInt())!=0){

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(scan.next());
				if(!map.containsKey(a)){
					map.put(a, 1);
				}else{
					map.put(a, map.get(a)+1);
				}
			}

			boolean f = false;
			for(Map.Entry<Integer, Integer> e : map.entrySet()){
				if(e.getValue()>n/2){
					System.out.println(e.getKey());
					f=true;
					break;
				}
			}
			if(!f) System.out.println("NO COLOR");
		}
	}
}