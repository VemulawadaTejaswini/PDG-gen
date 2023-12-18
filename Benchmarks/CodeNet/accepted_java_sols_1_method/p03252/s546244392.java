
import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		char []t = sc.next().toCharArray();
		
		int []c1 = new int [26 +'a'];
		int []c2 = new int [26 +'a'];
		
		for(int i = 'a' ; i < 26 +'a' ;i++) {
			c1[i] = -1;
			c2[i] = -1;
		}
		
		int n = s.length;
		int m = t.length;
		
		for(int i = 0 ; i < n ;i++) {
			c1[s[i]]++;
		}
		
		for(int i = 0 ; i < m ;i++) {
			c2[t[i]]++;
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean flag = true;
		for(int i = 'a' ; i < 'a' + 26 ; i++) {
			if(c1[i] != c2[i]) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
