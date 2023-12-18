import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int a, b, c, d, n, ans;
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		n = sc.nextInt();
		
		return true;
	}
	
	public static void solve(){
		
		if(n > 36){
			System.out.println(0);
			return;
		}
		
		ans = 0;
		
		for(a = 0; a < 10; a++){
			for(b = a; b < 10; b++){
				for(c = b; c < 10; c++){
					for(d = c; d < 10; d++){
						if((a+b+c+d)==n){
							if(a == b && b == c && c == d){
								ans++;
								break;
							}
							if(a == b && b == c && c != d){
								ans += 4;
								break;
							}
							if(a == b && b != c && c == d){
								ans += 6;
								break;
							}
							if(a != b && b == c && c == d){
								ans += 4;
								break;
							}
							if(a != b && b != c && c == d){
								ans += 12;
								break;
							}
							if(a != b && b == c && c != d){
								ans += 12;
								break;
							}
							if(a == b && b != c && c != d){
								ans += 12;
								break;
							}
							if(a != b && b != c && c != d){
								ans += 24;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}

}