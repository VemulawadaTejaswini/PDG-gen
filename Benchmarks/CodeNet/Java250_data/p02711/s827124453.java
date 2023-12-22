import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		a = n/100;
		b = n/10%10;
		c = n%100%10;
		if(a==7 || b ==7 || c == 7) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
