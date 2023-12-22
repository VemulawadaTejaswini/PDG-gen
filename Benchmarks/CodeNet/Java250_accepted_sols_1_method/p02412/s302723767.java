import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(;;){
		int n = scan.nextInt();
		int x = scan.nextInt();
		if(n ==0 && x == 0)
			break;
		int a = 1;
		int b = 1;
		int c = 1;
		int t = 0;
		for(a = 1; a <= n; ++a){
			for(b = 1; b <= n; ++b){
				for(c = 1; c <= n; ++c){
					if(c == b || c == b || b == a)
						break;
					if(c > b || b > a)
						break;
					if(c + b + a == x)
						++t;
						
					}
				}
			}
		System.out.println(t);
		}
	}
}


	