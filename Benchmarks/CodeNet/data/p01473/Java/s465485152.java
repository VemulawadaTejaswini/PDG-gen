import java.util.Scanner;

//Palindromic Anagram
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		long[] f = new long[21];
		f[0] = 1;
		for(int i=1;i<21;i++)f[i]=f[i-1]*i;
		char[] s = sc.next().toCharArray();
		int N = s.length;
		int[] c = new int[26];
		for(char r:s)c[r-'a']++;
		int odd = 0, kind = 0;
		long res = 0;
		for(int i=0;i<26;i++){
			kind+=c[i]==0?0:1;
			odd+=c[i]%2;
		}
		if(N%2==0){
			if(odd==0){
				res = f[kind];
				for(int i=0;i<26;i++)if(c[i]!=0)res/=f[c[i]/2];
			}
		}
		else {
			if(odd==1){
				kind = 0;
				for(int i=0;i<26;i++){
					if(c[i]%2==1)c[i]--;
					kind+=c[i]==0?0:1;
				}
				res = f[kind];
				for(int i=0;i<26;i++)if(c[i]!=0)res/=f[c[i]/2];
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}