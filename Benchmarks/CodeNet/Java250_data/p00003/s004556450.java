
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean tri[] = new boolean[N];
		int a,b,c,x;
		for(int i = 0; i < N; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a < b){
				x = a;
				a = b;
				b = x;
			}
			if(a < c){
				x = a;
				a = c;
				c = x;
			}
			if(a*a == (b*b) + (c*c)){
				tri[i] = true;
			} else {
				tri[i] = false;
			}
		}
		for(int i = 0; i < N; i++){
			if(tri[i] == true){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}