import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		TreeMap<Integer,Integer>map = new TreeMap<Integer,Integer>();
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i=0; i<n; i++){
			int a = sc.nextInt();
			if (map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
			list.add(a);
		}
		Collections.sort(list);

		for (int i=0; i<list.size(); i++){
			int b = list.get(i);
			for (int j=i+1; j<list.size(); j++){

				int c = list.get(j);

				if (c % b == 0){
					list.remove(j);
					j--;
				}

			}

			if (map.get(b) > 1){
				list.remove(i);
				i--;
			}

		}

		System.out.println(list.size());

	}

}