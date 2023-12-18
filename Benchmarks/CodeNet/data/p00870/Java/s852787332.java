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
	boolean[][] v;
	
	boolean match(int k, String t, int h, int x){
		if(k==n)return true;
		for(int i=0;i<n;i++){
			if(u[i])continue;
			int nx = x | (1<<i);
			if(v[nx][h+s[i].length()-1])continue;
			boolean f = t.startsWith(s[i]);
//			for(int j=0;j<s[i].length();j++){
//				if(t.charAt(h+j)!=s[i].charAt(j)){
//					f = false;
//					break;
//				}
//			}
			if(!u[i]&&f){
				v[nx][h+s[i].length()-1] = true;
				u[i] = true;
				if(match(k+1, t.substring(s[i].length()), h+s[i].length(), nx))return true;
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
				v = new boolean[(1<<n)+1][len+1];
				if(match(0, str.substring(i, i+len), 0, 0))c++;
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}