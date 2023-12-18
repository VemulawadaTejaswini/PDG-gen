import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[sc.nextInt()];
		for(int i = 0;i < s.length;i++) {
			s[i] = sc.nextInt();
		}
		int[] t = new int[sc.nextInt()];
		for(int i = 0;i < t.length;i++) {
			t[i] = sc.nextInt();
		}
		int cnt =0 ;
		for(int i = 0; i < t.length; i++) {
			for(int j = 0;j < s.length; j++) {
				if(t[i]==s[j]) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}