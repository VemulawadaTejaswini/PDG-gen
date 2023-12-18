import java.util.*;

class Main{
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			System.out.println("" + aoj0052(n));
		}
	}
	static int aoj0052(int n){
		int res = 0, m = 0;
		for(int i = n;i / 5 != 0;i/=5){
			m++;
		}
		while(m > 0){
			res += n / (int)Math.pow(5.0, (double)m);
			m--;
		}
		return res;
	}
}