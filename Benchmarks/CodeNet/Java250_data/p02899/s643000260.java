import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		Map <Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			map.put(a[i], i+1); 
		}
		
		
		for(int i = 0; i < n; i++) {
			System.out.print(map.get(i+1)+" ");
		}
		
		
	}

}
