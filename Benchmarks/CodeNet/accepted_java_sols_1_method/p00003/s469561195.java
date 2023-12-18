import java.util.*;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			int d = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
			if(d > b){
				int multi = d;
				d = b;
				b = multi;
			}
			if(b > c){
				int multi = b;
				b = c;
				c = multi;
			}
			if(d * d + b * b == c * c) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}