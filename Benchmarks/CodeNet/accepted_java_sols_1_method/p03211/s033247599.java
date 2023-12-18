import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	//static Var_form Var_name

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		//long Var_form = sc.nextLong();
		String S = sc.next();
		int min=Integer.MAX_VALUE;
		int ans=0;
		for(int i=1;i<=S.length()-2;i++){
			String subst="";
			subst = S.substring(i-1, i+2);//これでfromからtoの部分文字列をget
			int wk =0;
			wk = Integer.parseInt(subst);
			min=Math.min(Math.abs(753-wk),min);
		}
		ans=min;
		System.out.println(ans);
		//System.out.print(ans);
    }
}