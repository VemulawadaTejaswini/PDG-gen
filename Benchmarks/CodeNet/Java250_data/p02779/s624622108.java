
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		String result= "YES";
		int a;
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			if(map.containsKey(a)) {
				result = "NO";
				break;
			}else {
				map.put(a, 1);
			}
		}
		
		System.out.println(result);		
	}

}
