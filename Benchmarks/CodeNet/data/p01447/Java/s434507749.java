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
	int ans = 0;
	while(n/3!=0){
	    n /= 3;
	    ans++;
	}
	System.out.println(ans+1);
    }
}