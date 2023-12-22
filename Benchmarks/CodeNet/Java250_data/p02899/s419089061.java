
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer>map = new TreeMap<>();
		for(int i = 1; i <= n; i++){
			map.put(sc.nextInt(), i);
		}
		for(int i : map.keySet()){
			System.out.print(map.get(i));
			if(i != n){
				System.out.print(" ");
			}
		}
		
	}
}
