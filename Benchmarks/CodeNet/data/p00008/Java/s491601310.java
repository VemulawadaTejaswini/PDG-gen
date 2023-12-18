import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in); 
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 10; b++){
				for(int c = 0; c < 10; c++){
					for(int d = 0; d < 10; d++){
						if(a+b+c+d == n)res++;
					}
				}
			}
		}
		System.out.println(res);
	}
}