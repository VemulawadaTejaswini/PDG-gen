import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		boolean aa = false;
		// 奇数のみのときtrue
		boolean bb = true;
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(sc.next());
			if(a % 2 == 0) {
				bb = false;
				if(a % 3 == 0 || a% 5==0) {
					aa = true;
				} else {
					aa = false;
					break;
				}
			}
		}
		System.out.println(aa || bb ? "APPROVED": "DENIED");

	}
}
