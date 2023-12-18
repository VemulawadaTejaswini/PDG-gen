/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static double time1, time2;
	static double[] times1 = {70.0, 55.0, 50.0, 43.0, 40.0, 37.5, 35.5};
	static double[] times2 = {148.0, 116.0, 105.0, 89.0, 83.0, 77.0, 71.0};
	static String[] rank_str = {"E", "D", "C", "B", "A", "AA", "AAA"};
	static Scanner sc = new Scanner(System.in);

	static boolean read() {
		if(!sc.hasNextDouble()) return false;
		
		time1 = sc.nextDouble(); time2 = sc.nextDouble();
		return true;
	}
	
	static String solve() {
		String res = "NA";
		int rank1, rank2;
		
		rank1 = rank2 = -1;
		for(int i = 0; i < 7; i++) {
			if(times1[i] > time1) {
				rank1 = i;
			}
		}
		
		for(int i = 0; i < 7; i++) {
			if(times2[i] > time2) {
				rank2 = i;
			}
		}
		
		int rank = min(rank1, rank2);
		if(rank == -1) {
			res = "NA";
		} else {
			res = rank_str[rank];
		}

		return res;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}