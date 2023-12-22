import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] list = new int[3];
		for(int i = 3; i > 0; i--) {
			int x = s%10;
			s /= 10;
			list[i-1] = x;
			if(x == 1) {
				list[i-1] = 9;
			}else {
				list[i-1] = 1;
			}
		}
		for(int x : list) {
			System.out.print(x);
		}
	}
}
