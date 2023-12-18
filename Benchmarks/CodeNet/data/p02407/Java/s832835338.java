import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a;
		a = new int[110];
		int i;
		for(i = n; i >= 1; --i){
			int c = scan.nextInt();
			a[i] = c;
		}
		for(i = 1; i <= n; ++i){
			System.out.print(a[i]);
			if(i == n)
				break;
			System.out.print(" ");
		}
	}
}