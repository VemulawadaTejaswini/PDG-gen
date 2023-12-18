import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i,j;
		while(true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) break;
			for(i = 1; i <= H; i++) {
				for(j = 1; j <= W; j++) {
					if(i % 2 != 0 && j % 2 != 0) System.out.print('#');
					else if(i % 2 == 0 && j % 2 == 0) System.out.print('#');
					else System.out.print('.');
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}