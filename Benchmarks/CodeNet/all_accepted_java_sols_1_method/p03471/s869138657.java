import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		int a = y / 10000;
		y -= a * 10000;
		int b = y / 5000;
		y -= b * 5000;
		int c = y / 1000;
		while(a + b + c != n) {
			if((n - a - b - c) % 4 == 0 && b > 0) {
				b--;
				c += 5;
			}else if(a > 0){
			    a--;
			    b += 2;
			}else if(b > 0){
				b--;
				c += 5;
			}else{
				a = -1;
				b = -1;
				c = -1;
				break;
			}
		}
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.println(c);
	}
}
