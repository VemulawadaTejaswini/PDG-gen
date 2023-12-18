
import java.util.Scanner;

class Main {

	Scanner sc = new Scanner(System.in);



	public int dfs(int pos,int v,int bit){
		if(pos==n)return v==s?1:0;
		if(v>s)return 0;

		int res=0;
		for(int i=0;i<=9;i++){
			if(((bit>>i)&1)==0)
				res+=dfs(pos+1,v+(pos+1)*i,bit|(1<<i));
		}
		return res;
	}
	int n,s;
	public void run() {
		while(sc.hasNext()){
			n=sc.nextInt();s=sc.nextInt();

			ln(dfs(0,0,0));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}