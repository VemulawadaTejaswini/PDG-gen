import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int h = sca.nextInt();
	int w = sca.nextInt();
	int n = sca.nextInt();

	// hとwで大きいほうについて黒く塗ることを考える
	int pivot = 0;
	int non_pivot = 0;
	int ans = 0;
	if(h < w) {
		pivot = w;
		non_pivot = h;
	}
	else {
		pivot = h;
		non_pivot = w;
	}
	for(int i = 1; i <= non_pivot; i++) {
		if(n <= i*pivot) {
			ans = i;
			break;
		}
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}