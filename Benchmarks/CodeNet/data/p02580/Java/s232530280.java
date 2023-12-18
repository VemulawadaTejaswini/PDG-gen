
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();
		int h[] = new int[M];
		int w[] = new int[M];

		for(int i=0; i<M; i++) {
			h[i]=sc.nextInt();
			w[i]=sc.nextInt();	
		}

		Integer[][] h_max_index = new Integer[H+1][1];
		h_max_index[0][0]=0;
		int h_cnt;
		int h_max = 0;
		for(int i=1; i<=H; i++) {
			h_cnt=0;
			for(int h_m : h) {
				if(i==h_m) h_cnt++;
			}
			if(h_cnt>h_max) h_max=h_cnt;
			h_max_index[i][0]=h_cnt;
		}

		Integer[][] w_max_index = new Integer[W+1][1];
		w_max_index[0][0]=0;
		int w_cnt;
		int w_max = 0;
		for(int i=1; i<=W; i++) {
			w_cnt=0;
			for(int w_m : w) {
				if(i==w_m) w_cnt++;
			}
			if(w_cnt>w_max) w_max = w_cnt;
			w_max_index[i][0] = w_cnt;
		}

		ArrayList<Integer> al_h = new ArrayList<>();
		for(int i=1; i<=H; i++) {
			if(h_max_index[i][0]==h_max) {
				al_h.add(i);
			}
		}
		ArrayList<Integer> al_w = new ArrayList<>();
		for(int i=1; i<=W; i++) {
			if(w_max_index[i][0]==w_max) {
				al_w.add(i);
			}
		}

		ArrayList<Integer> dup_list = new ArrayList<>();
		int resultCnt = 0;
		int result = 0;

		for(int k = 0; k<al_w.size(); k++) {

			for(int i = 0; i<al_h.size(); i++) {
				for(int j=0; j<M; j++) {
					if(h[j]==al_h.get(i)) {
						dup_list.add(i);
						resultCnt++;
					}
				}	
			}

			for(int j=0; j<M; j++) {
				if(w[j]==al_w.get(k)) {
					if(dup_list.contains(j)==false) {
						resultCnt++;
					}
				}
			}	

			if(result<resultCnt) result = resultCnt;

		}

		System.out.println(result);
		
	}
}
