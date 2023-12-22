import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int P = scanner.nextInt();
		int Q = scanner.nextInt();
		int R = scanner.nextInt();
		
		int x = P + Q;
		int y = Q + R;
		int z = R + P;
		
		int min = x;
		
		int[] data = { x, y, z};
        // 最小値を求める
        for(int i = 0; i < data.length; i++)
                min = Math.min(min,data[i]);
        System.out.println(min);
	}
}