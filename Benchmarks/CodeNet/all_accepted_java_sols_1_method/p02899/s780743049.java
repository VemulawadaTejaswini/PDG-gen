import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    Map<Integer, Integer> status = new HashMap<>();
	    for (int i=0; i<n; i++) {
	    	status.put(i+1, scanner.nextInt());
	    }
	    // asc sort
	    status = status.entrySet().stream()
	    .sorted(Entry.<Integer,Integer>comparingByValue())
	    .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));

	    status.forEach((key,value) -> System.out.print(key + " "));

	    scanner.close();
	}

}
