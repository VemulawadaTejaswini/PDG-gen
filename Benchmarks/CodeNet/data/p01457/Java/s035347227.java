import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long left = 0;
		long right = 0;
		for(long z=0;z<n;z++){
			int a = sc.nextInt();
			String b  = sc.next();
			long c = sc.nextLong();
			if(b.charAt(0)=='('){
				left += c;
			}
			else{
				right += c;
			}
			if(left==right){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}