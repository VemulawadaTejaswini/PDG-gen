import java.util.*;
 
public class Main { 
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = 0;
		if(k<a){
			ans += k*1;
			System.out.println(ans);
			return;
		} else {
			ans += a*1;
			k -= a;
		}
		if(k<b){
			ans += k*0;
			System.out.println(ans);
			return;
		} else {
			ans += b*0;
			k -= b;
		}
		if(k<c){
			ans += k*(-1);
			System.out.println(ans);
			return;
		} else {
			ans += c*(-1);
			k -= c;
		}
		System.out.println(ans);
	}
}
