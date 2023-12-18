import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
			int purchaceCnt = s.nextInt();
			int canPackCnt = s.nextInt();
			s.nextLine();
			String[] values = s.nextLine().split(" ");
			Integer[] value = new Integer[values.length];
			for(int i=0 ; i<values.length ; i++){
				value[i] = new Integer(values[i]);
			}
			System.out.println(solve(purchaceCnt, canPackCnt, value));
		}
	}

	public static int solve(int purchaceCnt, int canPackCnt, Integer[] values) {
		Arrays.sort(values, Collections.reverseOrder());
		int cnt=0;
		int value = 0;
		for(int i=0 ; i<purchaceCnt ; i++) {
			cnt++;
			if(cnt==canPackCnt) {
				cnt = 0;
			}else {
				value += values[i].intValue();
			}
		}
		return value;
	}
}