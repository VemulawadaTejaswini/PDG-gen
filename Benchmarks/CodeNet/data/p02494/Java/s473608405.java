import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i, j;
		while(true) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		if(H == 0 && W == 0) break;
		for(i = 0; i < H; i++) {
			for(j = 0; j < W; j++) {
				System.out.print('#');
			}
			System.out.println();
		}
		System.out.println();
		}
	}
}