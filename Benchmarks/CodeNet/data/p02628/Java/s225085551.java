import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	//static Var_form Var_name;

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		//long Var_name = sc.nextLong();
		int ans=0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ary[]=new int[N+1];
		ary[0]=0;
		for(int i=1;i<=N;i++){
			ary[i]=sc.nextInt();
		}
		Arrays.sort(ary);
		for(int i=1;i<=K;i++){
			ans=ans+ary[i];
		}



		System.out.println(ans);
		//System.out.print(ans);
    }
}