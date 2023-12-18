import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		ans = 0;
		solve();
		System.out.println(ans);
	    }
	}
    }

    void solve(){
	for(int k=1; k<n; k++){
	    int s = n;
	    int t = k;
	    while(t != 0){
		int x = s;
		int y = t;
		s = y;
		t = x%y;
	    }
	    if(s==1) ans++;
	}
    }
}