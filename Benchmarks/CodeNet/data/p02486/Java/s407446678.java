import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		int ways;

		while (true){
			n = sc.nextInt();
			x = sc.nextInt();
			if (n == 0 && x == 0){
				break;
			}

			System.out.println("" + ways(1, n, x, 1, 3));
		}
	}

	// 再帰
	public static int ways(int init, int n, int x, int num, int max){
		int ways = 0;

		if (num > max){
			return 0;
		}

		for (int i = init; i <= n; i++){
			if (i == x){
				if (num == max){
					ways++;
				}
				break;
			}else{
				ways += ways(i + 1, n, x - i, num + 1, max);
			}
		}

		return ways;
	}
}