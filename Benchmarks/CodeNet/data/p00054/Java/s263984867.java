import java.util.*;

class Main {
	public static void main(String[] args){
		int a, b, n;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			a = scan.nextInt();
			b = scan.nextInt();
			n = scan.nextInt();
			System.out.println("" + aoj0054(a,b,n));
		}
	}
	static int aoj0054(int a,int b,int n){
		int res = 0;
		a %= b;
		for(int i = 0;i < n;i++){
			a *= 10;
			res += a / b;
			a %= b;
		}
		return res;
	}
}