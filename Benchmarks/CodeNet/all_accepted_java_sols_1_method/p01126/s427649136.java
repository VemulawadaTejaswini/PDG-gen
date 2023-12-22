import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Scanner insert = new Scanner(System.in);
		int n = -1;
		int m = -1;
		int a = -1;
		while(true) {
			String line = insert.nextLine();
			String array[] = line.split(" ");
			n = Integer.parseInt(array[0]);
			m = Integer.parseInt(array[1]);
			a = Integer.parseInt(array[2]);
			if((n==0) && (m == 0) && (a == 0)) {
				break;
			}
			int max = 0;
			HashMap<String,Integer> mapper = new HashMap<String,Integer>();
			for(int i =0; i < m; i++) {
				line = insert.nextLine();
				String array2[] = line.split(" ");
				if(Integer.parseInt(array2[0]) > max) {
					max = Integer.parseInt(array2[0]);
				}
				mapper.put(array2[0] + "," + array2[1], Integer.parseInt(array2[2]));
				mapper.put(array2[0] + "," + array2[2], Integer.parseInt(array2[1]));
			}
			for(int i = max; i > 0; i --) {
				if(mapper.containsKey(Integer.toString(i) + "," + Integer.toString(a))) {
					a = mapper.get(Integer.toString(i) + "," + Integer.toString(a));
				}
			}
			result.add(a);

		}
		for(int i = 0;i < (result.size());i++) {
			System.out.println(result.get(i));
		}
	}
}




