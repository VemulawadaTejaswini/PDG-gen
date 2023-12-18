import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
 
		long a = 2;
		long b = 1;
		long ans = 1;
 
		if(n == 1){
			System.out.println(1);
			return;
		}
 
		for(int i = 1; i < n; i++){
			ans = a+b;
			a = b;
			b = ans;
		}
		System.out.println(ans);
	}
}