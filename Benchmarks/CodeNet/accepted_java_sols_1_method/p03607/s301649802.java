import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap <Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			int a = sc.nextInt();
			if(!hm.containsKey(a)) {
				hm.put(a, 1);
			}
			else {
				hm.remove(a);
			}
		}
		System.out.println(hm.size());

	}

}
