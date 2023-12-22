import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		int maxlen=12;
		long[] space=new long[maxlen];
		space[0]=1;
		int ketasu=0;
		String ans="";
		for(int i=1; i<maxlen; i++) {
			space[i]=space[i-1]*26;
		}
		for(int i=1; i<maxlen; i++) {
			space[i]+=space[i-1];
		}
		for(int i=0; i<maxlen; i++) {
			if(N>=space[i]) {
				ketasu=i+1;
			}
			else {
				break;
			}
		}
		N-=space[ketasu-1];
		//lp(N+" "+ketasu);
		for(int i=0; i<ketasu; i++) {
			ans=((char)(N%26+'a'))+ans;
			N/=26;
		}
		lp(ans);
	}
	public static void lp(Object o) {
		System.out.println(o);
	}
}