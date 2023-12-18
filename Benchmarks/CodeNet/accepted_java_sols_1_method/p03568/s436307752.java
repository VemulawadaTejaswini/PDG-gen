import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int sub = 1;
		int ans = 1;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if(a[i]%2!=0){
				sub*=1;
			}else{
				sub*=2;
			}
			ans*=3;
		}
		System.out.println(ans - sub);
	}
}