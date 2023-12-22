
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x<y){
			int tmp = x;
			x = y;
			y = tmp;
		}

		while(true){
			int a = x % y;
			if(a==0){
				break;
			}
			x = y;
			y = a;
		}

		System.out.println(y);
	}
}


