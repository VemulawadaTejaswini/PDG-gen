import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rate = new int[8];
		int hi = 0;
		for (int i = 0; i < N; i++) {
			int col = sc.nextInt();
			if (col < 400) {
				rate[0]++;
			} else if (col < 800) {
				rate[1]++;
			} else if (col < 1200) {
				rate[2]++;
			} else if (col < 1600) {
				rate[3]++;
			} else if (col < 2000) {
				rate[4]++;
			} else if (col < 2400) {
				rate[5]++;
			} else if (col < 2800) {
				rate[6]++;
			} else if (col < 3200) {
				rate[7]++;
			} else {
				hi++;
			}
		}
		int min = 0;
		for (int i : rate) {
			if (i != 0) {
				min++;
			}
		}
		if (hi != 0 && min == 0) {
			System.out.println(1 + " " + hi);
		} else {
			int max = min + hi;
			System.out.println(min + " " + max);
		}
	}
}