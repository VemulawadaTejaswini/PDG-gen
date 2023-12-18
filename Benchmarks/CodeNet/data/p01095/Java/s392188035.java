import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		// create prime number list
		int max = (int)Math.sqrt(7368791)+5;
		while(true){	
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0){
				break;
			}
			boolean[] flag = new boolean[7368800];
			Arrays.fill(flag,true);
			int now = 0;
			int count = 0;
			boolean f = false;
			for(int i=m;i<flag.length;i++){
				if(count==n){
					f = true;
				}
				if(flag[i]){
					if(f){
						now = i;
						break;
					}
					count++;
					for(int j=i*2;j<flag.length;j+=i){
						flag[j] = false;
					}
				}
			}
			System.out.println(now);
		}
	}
}