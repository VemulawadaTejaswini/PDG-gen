import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<>();
		int N = sc.nextInt();
		for(int a=0; a<N; ++a) {
			A.add(sc.nextInt());
		}
		
		
		int p_num[] = new int[8];
		Arrays.fill(p_num, 0);
		int sp = 0;
		
		int redExist = 0;
		for(int a: A) {
			if(a<3200) {
				p_num[a/400] += 1;
			} else {
				sp += 1;
				redExist = 1;
			}
		}
		
		int ans = 0;
		for(int p: p_num) {
			if(p>0) {
				ans += 1;
			}
		}
		
		int ans_min = Math.max(ans,1);
		int ans_max = ans + sp;
		System.out.println(ans_min + " "+ ans_max);
	}

}
