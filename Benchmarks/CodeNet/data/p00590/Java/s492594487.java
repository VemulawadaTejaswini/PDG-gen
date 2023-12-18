import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[100000];
	setP(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    solve(p, n);
	}
    }

    static void solve(boolean[] p, int n){
	int cnt=0, i;
	for(i=1; i<=n; i++){
	    if(p[i] && p[n-i+1]) cnt++;
	}
	System.out.println(cnt);
    }

    static void setP(boolean[] p){
	Arrays.fill(p, true);
	p[0] = false; p[1] = false;
	for(int i=2; i<p.length; i++){
	    for(int j=i+i; j<p.length; j+=i){
		if(p[i]) p[j] = false;
	    }
	}
    }
}