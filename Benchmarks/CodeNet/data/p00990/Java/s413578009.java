/*
  1500 ID
  *以外の箇所の合計をまず求める
  同時進行で1と2の個数も求める
  バックトラックで候補検索
  該当でans++
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int x, sum;
    int ans;
    int n, m;
    String s;
    int[] a;
    int[] b = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};

    void run(){
	while(sc.hasNext()){
	    ans = 0;
	    n = sc.nextInt();
	    if(n!=0){
		s = sc.next();
		m = sc.nextInt();
		a = new int[m];
		for(int i=0; i<m; i++)
		    a[i] = sc.nextInt();
		solve();
		System.out.println(ans);
	    }
	}
    }

    void solve(){
	sum = 0;
	int n1=0, n2=0;
	    for(int i=0; i<s.length(); i++){
		// iは0始まり、i=0のとき1文字目
		String y = s.substring(i, i+1);
		if(y.equals("*")){
		    if(i%2!=0) n2++;
		    else n1++;
		}
		else {
		    if(i%2!=0){
			sum += b[Integer.parseInt(y)];
		    }
		    else sum += Integer.parseInt(y);
		}
	    }
	    //System.out.println(sum);
	search(0, n1, n2, sum);
    }

    void search(int level, int n1, int n2, int sum){
	if(n1==0 && n2==0){
	    if(sum%10==0) ans++;
	    return;
	}
	if(n1>0){
	    if(level==a.length-1)
		search(0, n1-1, n2, sum+a[level]);
	    else{
		search(0, n1-1, n2, sum+a[level]);
		search(level+1, n1, n2, sum);
	    }
	}
	else{
	    if(level==a.length-1){
		search(0, n1, n2-1, sum+b[a[level]]);
	    }
	    else{
		search(0, n1, n2-1, sum+b[a[level]]);
		search(level+1, n1, n2, sum);
	    }
	}
    }
}