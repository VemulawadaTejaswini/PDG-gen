import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    int m = sc.nextInt();
	    char[] c = sc.next().toCharArray();

	    int cnt = 0;
	    int ans = 0;
	    for(int i=0; i<c.length; i++){
		if(i+1<c.length && c[i]=='I' && c[i+1]=='O'){
		    cnt++;
		    //System.out.println("cnt "+cnt+" i "+i);
		    i++;
		}else if(c[i]=='I'){
		    //System.out.println("cnt "+cnt+" i "+i+" ans "+ans);
		    if(cnt-n+1>0) ans += cnt-n+1;
		    cnt = 0;
		}else if(c[i]=='O'){
		    //System.out.println("cnt "+cnt+" i "+i+" ans "+ans);
		    if(cnt-n>0) ans += cnt-n;
		    cnt = 0;
		}
	    }

	    System.out.println(ans);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}