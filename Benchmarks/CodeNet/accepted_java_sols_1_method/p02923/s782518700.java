import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(), H[] = new int[N], temp = 0, ans = 0;
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if (i != 0) {
				if (H[i - 1] >= H[i]) {
					temp++;
                  	//System.out.println("time"+(i+1));
				} else {
					if (ans <= temp) {
						ans = temp;
						temp = 0;
					} else {
						temp = 0;
					}
				}
			}
		}
		if(temp>=ans)
			ans = temp;
		System.out.println(ans);
	}
}