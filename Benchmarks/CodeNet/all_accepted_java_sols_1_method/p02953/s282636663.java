import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int N;
	static int[]Ary;
	static int Base;
	static String ans="Yes";
	

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Ary = new int[N+1];
		for(int i=1;i<=N;i++){
			Ary[i] = sc.nextInt();
		}

		Base=Ary[1];
		for(int i=1;i<=N;i++){
			
			if (Base<=Ary[i]) {
				Base=Ary[i];


			}
			else{
				if ((Base-Ary[i])>=2) {
					ans="No";
				}
			}
		}
		System.out.println(ans);
		//System.out.print(ans);
    }
    //関数定義
	//public static int funk(long X,long A) {
    //    return ;    
    //}
}				