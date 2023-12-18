import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		int[] a = new int[26];
		
		if(n>=8){
			for(int i=0;i<8;i++) a[s.codePointAt(i)-65]++;
			for(int i=0;;i++){
				if(a[0]==2 && a[3]==1 && a[8]==1 && a[13]==2 && a[20]==1 && a[24]==1){
					s = s.substring(0, i) + "AIZUNYAN" + s.substring(i+8, n);
					break;
				}
				if(i==n-8) break;
				a[s.codePointAt(i)-65]--;
				a[s.codePointAt(i+8)-65]++;
			}
		}
		System.out.println(s);
	}
}