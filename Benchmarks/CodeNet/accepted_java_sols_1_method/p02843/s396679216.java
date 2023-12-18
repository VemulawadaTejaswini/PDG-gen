import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0; i <= 1000; i++) {
			if(x >= 100*i && x <= (100*i)+(5*i)) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}