import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int rangeStart = B * 10;
		int ans = -1;

		for(int i = rangeStart; i < rangeStart + 10; i++) {
			if(A == (int)Math.floor(i*0.08)) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);


	}
}


