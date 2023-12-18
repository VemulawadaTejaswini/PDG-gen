import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int[][] hand = new int[4][9];
		String color;
		int r_cnt, g_cnt, b_cnt;
		int s_or_f;

		for(int n=0; n<data; n++){
			s_or_f = 1;
			r_cnt = 0;
			g_cnt = 0;
			b_cnt = 0;
			for(int i=0; i<9; i++){
				hand[0][i] = sc.nextInt();
			}
			for(int i=0; i<9; i++){
				color = sc.next();
				if("R".equals(color)){
					hand[1][r_cnt] = hand[0][i];
					r_cnt++;
				}if("G".equals(color)){
					hand[2][g_cnt] = hand[0][i];
					g_cnt++;
				}else if("B".equals(color)){
					hand[3][b_cnt] = hand[0][i];
					b_cnt++;
				}
			}
			if(r_cnt%3==0 && g_cnt%3==0 && b_cnt%3==0){
				if(r_cnt!=0) s_or_f = rummy(hand[1], r_cnt-1);
				if(s_or_f==1 && g_cnt!=0) s_or_f = rummy(hand[2], g_cnt-1);
				if(s_or_f==1 && b_cnt!=0) s_or_f = rummy(hand[3], b_cnt-1);
				if(s_or_f==1){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else{
				System.out.println(0);
			}
		}
	}

	static int rummy(int[] hand, int cnt){
		int i;
		int[] index = new int[2];

		while(true){
			i = 0;
			Arrays.sort(hand, 0, cnt+1);
			while(hand[i]==0){
				i++;
				if(i>cnt) return 1;
			}
			if(hand[i]==hand[i+1]){
				if(hand[i]==hand[i+2]){
					Arrays.fill(hand, i, i+3, 0);
					continue;
				}
			}
			index[0] = Arrays.binarySearch(hand, i+1, cnt+1, hand[i]+1);
			if(index[0]>=0){
				index[1] = Arrays.binarySearch(hand, i+2, cnt+1, hand[i]+2);
				if(index[1]>=0){
					hand[i] = 0;
					hand[index[0]] = 0;
					hand[index[1]] = 0;
					continue;
				}else{
					return 0;
				}
			}else{
				return 0;
			}
		}
	}
}