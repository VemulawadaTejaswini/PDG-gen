import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(d==0 && e==0){
				break;
			}
			double ans = 100000.0;
			for(int i=0;i<=d/2;i++){
				ans = Math.min(ans, Math.abs(Math.sqrt(i*i+(d-i)*(d-i))-(double)e));
			}
			System.out.println(ans);
		}
	}
}