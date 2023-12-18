import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] H = new int[N];
		for (int i=0;i<N;i++) {
			H[i] = Integer.parseInt(sc.next());
		}

		int flag = 0;
		int height = H[0];
		for (int i=1;i<N;i++) {
			if (height<H[i]) {
				height = H[i]-1;
			} else if (height>H[i]) {
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}