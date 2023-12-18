import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int[] ans = new int[s.length()];
		int a = 0;
		int b = 0;
		char now_c = 'R';
		int idx_r_to_l = 0;
		int i = 0;
		while(i<s.length()) {
			if(now_c=='R') {
				if(s.charAt(i)=='L') {
					idx_r_to_l = i-1;
					now_c = 'L';
				}
				if(i%2==0) a++;
				else b++;
			}else {
				if(s.charAt(i)=='R') {
					ans[idx_r_to_l] = idx_r_to_l%2==0?a:b;
					ans[idx_r_to_l+1] = (idx_r_to_l+1)%2==0?a:b;
					now_c = 'R';
					a = 0;
					b = 0;
				}
				if(i%2==0) a++;
				else b++;
			}
			i++;
		}
		ans[idx_r_to_l] = idx_r_to_l%2==0?a:b;
		ans[idx_r_to_l+1] = (idx_r_to_l+1)%2==0?a:b;
		
		for(int j=0;j<s.length();j++) {
			System.out.print(ans[j] + " ");
		}
		in.close();

	}

}
