import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int [] dp=new int[100];
		int prevsize=0;
		while(sc.hasNext()){
			String[] st=sc.next().split(",");
			if(st.length>prevsize){
				for(int i=st.length-1;i>=0;i--){
					dp[i]=(i>=1?Math.max(dp[i],dp[i-1]):dp[i])+Integer.parseInt(st[i]);
				}
			}else{
				for(int i=0;i<st.length;i++){
					dp[i]=Math.max(dp[i],dp[i+1])+Integer.parseInt(st[i]);
				}
			}
			prevsize=st.length;
		}
		ln(dp[0]);
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