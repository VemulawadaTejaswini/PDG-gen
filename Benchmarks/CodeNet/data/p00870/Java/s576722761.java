import java.util.Arrays;
import java.util.Scanner;

//Search of Concatenated Strings
public class Main{

	int n, m, len;
	String[] s;
	String str;
	int[] a;
	int[][] sum;
	boolean[] u;
	
	boolean match(int k, String t){
		if(k==n)return true;
		for(int i=0;i<n;i++){
			if(!u[i]&&t.startsWith(s[i])){
				u[i] = true;
				if(match(k+1, t.substring(s[i].length())))return true;
				u[i] = false;
			}
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			m = sc.nextInt();
			if((n|m)==0)break;
			s = new String[n];
			for(int i=0;i<n;i++)s[i]=sc.next();
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<m;i++)sb.append(sc.next());
			str = sb.toString();
			len = 0;
			a = new int[26];
			for(int i=0;i<n;i++){
				len += s[i].length();
				for(char ch:s[i].toCharArray())a[ch-'a']++;
			}
			sum = new int[str.length()+1][26];
			for(int i=1;i<=str.length();i++){
				for(int j=0;j<26;j++){
					sum[i][j] = sum[i-1][j] + (str.charAt(i-1)-'a'==j?1:0);
				}
			}
			int c = 0;
			u = new boolean[n];
			for(int i=0;i+len<=str.length();i++){
				boolean f = true;
				for(int j=0;j<26;j++){
					if(a[j]!=sum[i+len][j]-sum[i][j]){
						f = false;
						break;
					}
				}
				if(!f)continue;
				Arrays.fill(u, false);
				if(match(0, str.substring(i, i+len)))c++;
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}