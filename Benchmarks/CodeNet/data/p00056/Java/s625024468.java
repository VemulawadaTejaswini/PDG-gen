import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[50000];
	setp(p);
	while(kbd.hasNext()){
	    int n= kbd.nextInt();
	    if(n!=0) solve(p, n);
	}
    }

    static void solve(boolean[] p, int n){
	int ans=0, i, j;
	for(i=0; i<p.length; i++){
	    for(j=i; j<p.length; j++){
		if(p[i]&&p[j] && i+j==n) ans++;
	    }
	}
	System.out.println(ans);
    }

    static void setp(boolean[] p){
	Arrays.fill(p, true);
	int i, j;
	p[0] = false;
	p[1] = false;
	for(i=2; i<p.length; i++){
	    for(j=i+i; j<p.length; j+=i){
		if(p[i]) p[j] = false;
	    }
	}
    }
}