import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> modevalue = new HashMap<Integer, Integer>();
		int i = 0;
		int minValue = 101;
		int maxValue = -1;
		
			while (sc.hasNext()) {
				i = sc.nextInt();
				
					if (i == 0) break;
				minValue = Math.min(i, minValue);
				maxValue = Math.max(i, maxValue);
				
					if (modevalue.containsKey(i)) {
						modevalue.put(i, modevalue.get(i) + 1);
					} else {
						modevalue.put(i, 1);
					}
			}
			

			
			int maxFreq = -1;
			
			for (int n = minValue; n <= maxValue; n++) {
				if (modevalue.containsKey(n)) {
					maxFreq = Math.max(maxFreq, modevalue.get(n));
				}
			}
			
			for (int n = minValue; n <= maxValue; n++) {
				if (modevalue.containsKey(n) && modevalue.get(n) == maxFreq) System.out.println(n);
			}
	}

}
