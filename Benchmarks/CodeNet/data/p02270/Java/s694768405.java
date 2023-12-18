import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int productCnt = Integer.parseInt(line[0]);
		int trackCnt = Integer.parseInt(line[1]);
		int[] weight = new int[productCnt];
		for(int i=0 ; i<productCnt ; i++) {
			weight[i] = Integer.parseInt(s.nextLine());
		}
		System.out.println(answer(trackCnt, weight));
	}

	// n*logn?????´???
	public static int answer(int trackCnt, int[] weight) {
		int left = 0;
		int right = 100000 * 10000;

		int point = 0;
		boolean can = true;
		while(left < right) {
			can = true;
			//?????????????±????
			point = (left + right) / 2;
			int[] track = new int[trackCnt];
			int index = 0;
			for(int i=0 ; i<weight.length ; i++) {
				//???????????????????????´???
				if(track[index]+weight[i] <= point) {
					track[index] += weight[i];
				}
				//?¬??????????????????????????????????????????´???
				else if(track[index]+weight[i] > point && trackCnt != (index+1)) {
					index++;
					track[index] += weight[i];
				}
				//???????????°?????????????????´???
				else {
					can = false;
					break;
				}
			}
			//??¨?????????????????°??????????????´???
			if(can) {
				right = point - 1;
			}
			else {
				left = point + 1;
			}
		}
		if(can)
			return right;
		else
			return left + 1;

	}

	//n^2?????´???
	public static int solve(int trackCnt, int[] weight) {
		int p = 0;
		int index = 0;
		int[] track = new int[trackCnt];
		outer: for(; p<10000*weight.length ; p++) {
			index = 0;
			Arrays.fill(track, 0);
			inner: for(int i=0 ; i<weight.length ; i++) {
				if(track[index]+weight[i] > p && (trackCnt == index+1)) {
					continue outer;
				} else if(track[index]+weight[i] > p) {
					index++;
					i--;
				} else {
					track[index] += weight[i];
				}
			}
			break;
		}
		return p;
	}
}