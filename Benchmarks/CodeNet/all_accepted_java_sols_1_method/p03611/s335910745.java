import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

		for (int i=0; i<N; i++){
			int a = sc.nextInt();
			for (int j=-1; j<=1; j++){
				int num = a + j;
				if (map.containsKey(num)){
					map.put(num, map.get(num) + 1);
				} else {
					map.put(num,1);
				}
			}
		}
		int ret=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			int value = entry.getValue();
			ret = Math.max(ret,value);
		}
		System.out.println(ret);
	}
}



