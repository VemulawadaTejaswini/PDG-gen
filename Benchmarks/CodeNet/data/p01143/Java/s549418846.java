import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int n; // 競技者数
    int m; // 優勝者の番号
    double p; // 控除率
    int sum; // 掛け金合計

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    p = sc.nextDouble();
	    sum = 0;
	    if(n!=0){ // 1 <= N <= 100 より
		solve();
	    }
	}
    }

    void solve(){
	int[] t = new int[n+1];
	for(int i=1; i<t.length; i++){
	    t[i] = sc.nextInt();
	    sum += t[i];
	}

	sum = sum*100; // 掛け金合計
	sum -= sum*(p/100); // 控除済み
	//System.out.println(sum);
	int ans = 0;

	if(t[m]!=0){
	    ans = sum/t[m];
	}

	System.out.println(ans);
    }
}