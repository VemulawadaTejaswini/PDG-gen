import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		int[] c = new int[26];
		for(int i=0;i<s.length;i++) c[(int)s[i]-96]++;
		int odd = 0;
		for(int i=0;i<26;i++){
			if(c[i]%2==1) odd++;
		}
		if(odd > s.length%2){
			System.out.println(0);
		}else{
			long[] p = new long[21];
			p[0] = 1;
			for(int i=1;i<=20;i++) p[i] = p[i-1]*i;
			
			long sum = 1;
			for(int i=0;i<26;i++) sum *= p[c[i]/2];
			System.out.println(p[s.length/2]/sum);
		}
	}	
}