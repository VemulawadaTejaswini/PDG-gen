import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int n, sw=0;
		if(b != 100) {
			if(b/10 == 0) {
				n = a*10+b;
			} else {
				n = a*100+b;
			}
		} else {
			n = a*1000+b;
		}
		for(int i = 1; i*i <= n; i++) {
			if(i*i == n) {
				System.out.println("Yes");
				sw = 1;
				break;
			}
		}
		if(sw == 0)	System.out.println("No");
	}
}