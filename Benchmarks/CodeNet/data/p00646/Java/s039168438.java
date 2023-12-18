import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n);
	}
    }

    static void solve(int n){
	int i, j, cnt=0;
	for(i=1; i<=n; i++){
	    for(j=i; j<=n; j++){
		if(lcm(i, j, n)) cnt++;
	    }
	}
	System.out.println(cnt);
    }

    static boolean lcm(int a, int b, int n){
	int l = Math.min(a, b);
	while(!(l%a==0 && l%b==0)) l+=Math.min(a, b);
	if(l==n) return true;
	return false;
    }
}