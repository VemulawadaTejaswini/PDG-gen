import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		int l = N.length();
		int ans = 0;
		for(int i=0;i<l;++i){
			ans += N.charAt(i) - '0';
		}
		if(ans%9==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}

