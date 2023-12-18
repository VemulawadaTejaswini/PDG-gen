import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		while(b <= a) {
			b = b*2;
			k--;
		}
		while(c <= b) {
			c = c*2;
			k--;
		}
		
		if(k<0) System.out.println("No");
		else System.out.println("Yes");
	}
}
