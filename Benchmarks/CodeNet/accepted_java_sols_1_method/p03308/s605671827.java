import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int N;
	static int wk;
	static int Max=0;
	static int Min=1000000000;
	static int ans=0;

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=1;i<=N;i++){
			wk=sc.nextInt();
			Max=Math.max(Max,wk);
			Min=Math.min(Min,wk);
		}

		ans=Max-Min;


		System.out.println(ans);
		//System.out.print(ans);
    }
}