import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int preHeight = sc.nextInt();
		int max = 0;
		for(int i=0;i<n-1;i++) {
			int height = sc.nextInt();
			if(height<=preHeight) {
				count++;
				if(count>=max) {
					max = count;
				}
			// 移動できなかった場合、カウンタをリセット
			}else {
				count = 0;
			}
			preHeight = height;
		}
		sc.close();
		System.out.println(max);
	}

}
