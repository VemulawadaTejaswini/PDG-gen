import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        BigDecimal[] array = Arrays.stream(sc.nextLine().split(" ")).map(num -> new BigDecimal(num)).sorted().toArray(num -> new BigDecimal[num]);
        BigDecimal max = new BigDecimal(0);
        for (int i = 0; i < array.length; i++) {
			BigDecimal pre = array[i];
	        BigDecimal sum = new BigDecimal(0);
	        for (int j = 0; j < array.length; j++) {
	        	if (i == j) {
	        		continue;
	        	}
				BigDecimal num = array[j];
				sum = pre.add(num).divide(new BigDecimal(2), 10, BigDecimal.ROUND_DOWN);
	        	pre = sum;
	        }
	        if (max.compareTo(sum) < 1) {
	        	max = sum;
	        }
		}
        System.out.println(max.toString());
    }
}
