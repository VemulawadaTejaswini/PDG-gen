import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long INF = 1L<<50;
		int a = in.nextInt();
		int b = in.nextInt();
		int q = in.nextInt();
		long[] s = new long[a];
		for(int i=0;i<a;i++) {
			s[i] = in.nextLong();
		}
		long[] t = new long[b];
		for(int i=0;i<b;i++) {
			t[i] = in.nextLong();
		}
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		for(int i=0;i<q;i++) {
			long start_postition = in.nextLong();
			long[] ans_candidate = new long[8];
			//s_t
			//s
			int s_idx = -(Arrays.binarySearch(s, start_postition)+1);
			long tmp_position0 = 0;
			long tmp_position1 = 0;
			if(s_idx==0) {
				ans_candidate[0] += INF;
				ans_candidate[1] += INF;
				ans_candidate[2] += Math.abs(start_postition-s[s_idx]);
				ans_candidate[3] += Math.abs(start_postition-s[s_idx]);
				tmp_position1 = s[s_idx];
			}else if(s_idx==a){
				ans_candidate[0] += Math.abs(start_postition-s[s_idx-1]);
				ans_candidate[1] += Math.abs(start_postition-s[s_idx-1]);
				ans_candidate[2] += INF;
				ans_candidate[3] += INF;
				tmp_position0 = s[s_idx-1];
			}else {
				ans_candidate[0] += Math.abs(start_postition-s[s_idx-1]);
				ans_candidate[1] += Math.abs(start_postition-s[s_idx-1]);
				ans_candidate[2] += Math.abs(start_postition-s[s_idx]);
				ans_candidate[3] += Math.abs(start_postition-s[s_idx]);
				tmp_position0 = s[s_idx-1];
				tmp_position1 = s[s_idx];
			}
			//t0
			if(tmp_position0!=0) {
				int t_idx0 = -(Arrays.binarySearch(t, tmp_position0)+1);
				if(t_idx0==0) {
					ans_candidate[0] += INF;
					ans_candidate[1] += Math.abs(tmp_position0-t[t_idx0]);
				}else if(t_idx0==b){
					ans_candidate[0] += Math.abs(tmp_position0-t[t_idx0-1]);
					ans_candidate[1] += INF;
				}else {
					ans_candidate[0] += Math.abs(tmp_position0-t[t_idx0-1]);
					ans_candidate[1] += Math.abs(tmp_position0-t[t_idx0]);
				}
			}
			//t1
			if(tmp_position1!=0) {
				int t_idx1 = -(Arrays.binarySearch(t, tmp_position1)+1);
				if(t_idx1==0) {
					ans_candidate[2] += INF;
					ans_candidate[3] += Math.abs(tmp_position1-t[t_idx1]);
				}else if(t_idx1==b){
					ans_candidate[2] += Math.abs(tmp_position1-t[t_idx1-1]);
					ans_candidate[3] += INF;
				}else {
					ans_candidate[2] += Math.abs(tmp_position1-t[t_idx1-1]);
					ans_candidate[3] += Math.abs(tmp_position1-t[t_idx1]);
				}
			}
			
			//t_s
			//t
			int t_idx = -(Arrays.binarySearch(t, start_postition)+1);
			tmp_position0 = 0;
			tmp_position1 = 0;
			if(t_idx==0) {
				ans_candidate[4] += INF;
				ans_candidate[5] += INF;
				ans_candidate[6] += Math.abs(start_postition-t[t_idx]);
				ans_candidate[7] += Math.abs(start_postition-t[t_idx]);
				tmp_position1 = t[t_idx];
			}else if(t_idx==b){
				ans_candidate[4] += Math.abs(start_postition-t[t_idx-1]);
				ans_candidate[5] += Math.abs(start_postition-t[t_idx-1]);
				ans_candidate[6] += INF;
				ans_candidate[7] += INF;
				tmp_position0 = t[t_idx-1];
			}else {
				ans_candidate[4] += Math.abs(start_postition-t[t_idx-1]);
				ans_candidate[5] += Math.abs(start_postition-t[t_idx-1]);
				ans_candidate[6] += Math.abs(start_postition-t[t_idx]);
				ans_candidate[7] += Math.abs(start_postition-t[t_idx]);
				tmp_position0 = t[t_idx-1];
				tmp_position1 = t[t_idx];
			}
			//t0
			if(tmp_position0!=0) {
				int s_idx0 = -(Arrays.binarySearch(s, tmp_position0)+1);
				if(s_idx0==0) {
					ans_candidate[4] += INF;
					ans_candidate[5] += Math.abs(tmp_position0-s[s_idx0]);
				}else if(s_idx0==a){
					ans_candidate[4] += Math.abs(tmp_position0-s[s_idx0-1]);
					ans_candidate[5] += INF;
				}else {
					ans_candidate[4] += Math.abs(tmp_position0-s[s_idx0-1]);
					ans_candidate[5] += Math.abs(tmp_position0-s[s_idx0]);
				}
			}
			//t1
			if(tmp_position1!=0) {
				int s_idx1 = -(Arrays.binarySearch(s, tmp_position1)+1);
				if(s_idx1==0) {
					ans_candidate[6] += INF;
					ans_candidate[7] += Math.abs(tmp_position1-s[s_idx1]);
				}else if(s_idx1==a){
					ans_candidate[6] += Math.abs(tmp_position1-s[s_idx1-1]);
					ans_candidate[7] += INF;
				}else {
					ans_candidate[6] += Math.abs(tmp_position1-s[s_idx1-1]);
					ans_candidate[7] += Math.abs(tmp_position1-s[s_idx1]);
				}
			}
			
			long ans = Long.MAX_VALUE;
			for(int j=0;j<8;j++) {
				ans = Math.min(ans, ans_candidate[j]);
			}
			sb.append(ans);
			sb.append(ls);
			
		}
		System.out.println(sb.toString());
		in.close();

	}

}
