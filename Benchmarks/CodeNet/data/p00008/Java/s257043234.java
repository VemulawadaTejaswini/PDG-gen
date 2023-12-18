import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }

    public static void solve(){
	int n = kbd.nextInt();
	int i, j, k;
	int cnt=0;
	for(i=0; i<10; i++){
	    for(j=i; j<10; j++){
		for(k=j; k<10; k++){
		    int x = n-i-j-k;
		    if(x<=i && x>=0) {
			// 4つ等しい
			if(i==j && j==k && k==x){
			    cnt += fac(4)/fac(4);
			}
			// 3つ等しい
			else if((x==i && i==j)||(i==j && j==k)){
			    cnt += fac(4)/(fac(3)*fac(1));
			}
			// 2つずつ等しい
			else if(x==i && j==k){
			    cnt += fac(4)/(fac(2)*fac(2));
			}
			// 2つ等しい
			else if(x==i || i==j || j==k){
			    cnt += fac(4)/(fac(2)*fac(1)*fac(1));
			}
			// 全て違う
			else cnt += fac(4);			
		    }
		}
	    }
	}
	System.out.println(cnt);
    }

    public static int fac(int n){
	if(n==1) return 1;
	return n*fac(n-1);
    }
}