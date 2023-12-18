import java.util.*;
import java.io.*;

public class Main{
	void solve(){

		Scanner cin = new Scanner(System.in);
		while(true)
		{
			int e = cin.nextInt();
			if(e==0) return;
			int ret = e;
			for(int i=0;i*i*i<=e;i++){
				for(int j=0;j*j<=e-i*i*i;j++){
					ret = Math.min(ret, i + j + (e - i * i * i - j * j));
				}
			}
			System.out.println(ret);
		}
	}


	public static void main(String[] args){
		new Main().solve();
	}
}