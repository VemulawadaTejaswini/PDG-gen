import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i=0;i<3;i++) {
			map.put(scanner.nextInt(), 0);
		}
		System.out.println(map.size());
		scanner.close();
	}

}
