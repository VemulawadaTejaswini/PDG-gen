import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Map<Integer,Integer> list = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			list.put(sc.nextInt(),i);
		}
		
		for(Integer str:list.keySet()){
		      System.out.print(list.get(str)+" ");
		    }
		
	}
}