import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int k = in.nextInt();
		if(k%2 == 0 || k%5 == 0)
			out.println(-1);
		else{
			int cur = 7%k;
			int ans = 1;
			while(cur != 0){
				cur = cur*10 + 7;
				cur %= k;
				ans ++;
			}
			out.println(ans);
		}
	}
}
