import java.util.*;
import java.io.PrintWriter;
import java.math.BigInteger;

class Main{
	void solve(){
		int N=cin.nextInt();
		int M=cin.nextInt();
		int R=cin.nextInt();

		if(N*M>R){
			cout.println(0);
			return;
		}

		int RR=R-N*M;
		//(RR+N-1)C(RR)
		BigInteger ans=new BigInteger("1");
		for(int i=2;i<=RR+N-1;i++){
			ans=ans.multiply(new BigInteger(""+i));
		}
		for(int i=2;i<=RR;i++){
			ans=ans.divide(new BigInteger(""+i));
		}
		for(int i=2;i<=N-1;i++){
			ans=ans.divide(new BigInteger(""+i));
		}
		cout.println(ans);
	}
	//-----------------------------------------------------

	public static void main(String args[]){
		cin=new Inputer();
		cout=new PrintWriter(System.out);
		new Main().solve();
		cout.flush();
	}

	static class Inputer{
		private static Scanner sc;
		Inputer(){
			sc=new Scanner(System.in);
		}
		String next(){
			return sc.next();
		} 
		int nextInt(){
			return Integer.parseInt(sc.next());
		}
		long nextLong(){
			return Long.parseLong(sc.next());
		}
		double nextDouble(){
			return Double.parseDouble(sc.next());
		}
		char[] nextCharArray(){
			return sc.next().toCharArray();
		}
	}

	private static Inputer cin;
	private static PrintWriter cout;
}