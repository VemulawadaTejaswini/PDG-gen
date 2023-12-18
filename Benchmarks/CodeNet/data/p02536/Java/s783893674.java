import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]cities = new int[m][2];
		for(int i = 0; i < m; i++) {
			cities[i][0] = sc.nextInt();
			cities[i][1] = sc.nextInt();
		}
		if((n - 1) - m != 0) {
			System.out.println((n - 1) - m);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}