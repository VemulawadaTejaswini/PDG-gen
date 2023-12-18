import java.util.Scanner;
import java.util.TreeMap;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	TreeMap<Double, String> minimumMap = new TreeMap<Double, String>();
	minimumMap.put(48.00, "light fly");
	minimumMap.put(51.00, "fly");
	minimumMap.put(54.00, "bantam");
	minimumMap.put(57.00, "feather");
	minimumMap.put(60.00, "light");
	minimumMap.put(64.00, "light welter");
	minimumMap.put(69.00, "welter");
	minimumMap.put(75.00, "light middle");
	minimumMap.put(81.00, "middle");
	minimumMap.put(91.00, "light heavy");
	minimumMap.put(Double.MAX_VALUE, "heavy");

	while (in.hasNext()) {
	 System.out.println(minimumMap.ceilingEntry(in.nextDouble()).getValue());
	}
 }
}