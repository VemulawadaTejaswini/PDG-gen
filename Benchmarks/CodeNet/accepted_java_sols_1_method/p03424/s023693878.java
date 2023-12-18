import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Map<Character,Integer> map = new HashMap<>(); 
		for(int i=0;i<n;i++) {
			map.put(sc.next().charAt(0),0);
		}
		Object[] array = map.keySet().toArray();
		if(array.length==4)
		System.out.println("Four");
		else {
			System.out.println("Three");
		}
	}

}
