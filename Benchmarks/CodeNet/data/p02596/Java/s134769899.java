import java.util.*;
class Main {

	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int cnt = 0;
		
		
		if(n%2 == 0){
			System.out.println(-1);
			return;
		}
		
		String nana = new String();
		while(true){
			cnt++;
			nana = nana + "7";
			int i = Integer.parseInt(nana);
			if(i%n == 0){
				System.out.println(cnt);
				
				return;
			}
		}

		
		}
	}