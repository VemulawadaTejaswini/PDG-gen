import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[4];
		int y[] = new int[4];
		for(int i = 0; i < 2; i ++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for(int i = 2; i < 4; i ++) {
			x[i] = x[i - 1] + y[i - 2] - y[i - 1];
			System.out.print(x[i]+" ");
			y[i] = y[i - 1] - x[i - 2] + x[i - 1];
			if(i == 2) {
				System.out.print(y[i]+" ");
			}else {
				System.out.println(y[i]);
			}
		}
	}
}