import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] a;
		a = new int[13][11];
		int n = scan.nextInt();
		int i;
		for(i = 1; i <= n; ++i){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			a[(b - 1) * 3 + f][r] = a[(b - 1) * 3 + f][r] + v;
		}
		int q;
		for(i = 1; i <= 12; ++i){
			for(q = 1; q <= 10; ++q){
				System.out.print(" "+a[i][q]);
				}
			if(i % 3 == 0){
				if(i == 12)
					break;
				System.out.println();
				for(int v = 1;v <= 20; ++v)
				System.out.print("#");
			}
			if(i == 12)
				break;
			System.out.println();
		}
		System.out.println();
	}
}