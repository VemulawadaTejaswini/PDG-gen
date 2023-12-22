
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
 		long a = sc.nextLong();
 		long b = sc.nextLong();
 		long c = sc.nextLong();
 		long d = sc.nextLong();
 		long count = 0;

 		count = b - a + 1;
 		count -= (b / c) - (a / c);
 		count -= (b / d) - (a / d);
 		if(b >= c && a % c == 0){
 			count -= 1;
 		}
 		if(b >= d && a % d == 0){
 			count -= 1;
 		}
 		long e = c;
 		long f = d;
 		if(f<e){
 			long temp = f;
 			f = e;
 			e = temp;
 		}
 		while(true){
 			if(e == 0){
 				break;
 			}
 			long x = f % e;
 			f = e;
 			e = x;
 		}
 		count += (b / (c * d / f)) - (a / (c * d / f));
 		if(b >= (c * d / f) && a % (c * d / f) == 0){
 			count += 1;
 		}

 		System.out.println(count);       
    }
}