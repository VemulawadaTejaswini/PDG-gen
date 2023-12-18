import java.util.*;
import java.io.*;

public class Main{
	void solve(){

		Scanner cin = new Scanner(System.in);
		while(true)
		{
			int n = cin.nextInt();
			if(n==0) return;
			int[] time = new int[n*2];
			for(int i=0;i<2*n;i++){
				time[i] = gettime(cin.next()) + (i+1) % 2;
			}
			Arrays.sort(time);
			int ret = 0;
			int now = 0;
			for(int a : time){
				if(a%2==1) now++;
				else now--;
				ret= Math.max(ret, now);
			}
			System.out.println(ret);
		}
	}

	int gettime(String s){
		int ret = 0;
		ret += s.charAt(0) - '0';
		ret *= 10;
		ret += s.charAt(1) - '0';
		ret *= 10;
		ret += s.charAt(3) - '0';
		ret *= 10;
		ret += s.charAt(4) - '0';
		ret *= 10;
		ret += s.charAt(6) - '0';
		ret *= 10;
		ret += s.charAt(7) - '0';
		ret *= 10;
		return ret;
	}

	public static void main(String[] args){
		new Main().solve();
	}
}