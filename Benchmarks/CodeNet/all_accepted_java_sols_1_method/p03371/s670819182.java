import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int d = a + b;
		int sum = 0;
		
		if(d <= c*2) {
			sum += Math.min(x,y) * d;
			if(x > y) {
				sum += (x - y) * a;
			}
			else {
				sum += (y - x) * b;
			}
			System.out.println(sum);
		}
		
		if(d > c*2) {
			sum += Math.min(x,y) * 2 * c;
			if(x > y) {
				if(2*c > a) {
				   sum += (x - y) * a;
				}
				if(2*c <= a) {
					sum += (x - y) * 2 * c;
				}
			}
			if(x <= y) {
				if(2*c> b) {
					   sum += (y - x) * b;
					}
			    if(2*c <= b){
						sum += (y - x) * 2 * c;
					}
				}
			System.out.println(sum);
		}
		

	}

}
