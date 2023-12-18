import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		String ans="";
		while(N>0) {
			ans=((char) ((N+25)%26 + 'a'))+ans;
			lp(ans);
			N/=26;
		}
	}
	public static void lp(Object o) {
		System.out.println(o);
	}
}