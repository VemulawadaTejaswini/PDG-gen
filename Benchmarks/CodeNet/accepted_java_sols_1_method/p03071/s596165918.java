import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if(a >= b){
			ans += a;
			a--;
		}else{
			ans += b;
			b--;
		}
		if(a >= b){
			ans += a;

		}else{
			ans += b;
		}
		System.out.print(ans);
	}
}
