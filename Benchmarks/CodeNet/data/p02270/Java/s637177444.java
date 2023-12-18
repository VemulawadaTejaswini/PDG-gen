import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int productCnt = Integer.parseInt(line[0]);
		int trackCnt = Integer.parseInt(line[1]);
		int[] weight = new int[productCnt];
		for(int i=0 ; i<productCnt ; i++) {
			weight[i] = Integer.parseInt(s.nextLine());
		}
		System.out.println(solve(trackCnt, weight));
	}

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