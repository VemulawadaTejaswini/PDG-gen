import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();

		int count = 0;
		int f = 0;
		for(int i=0; i<N; i++) {
			f = S.indexOf("ABC", f);
			if(f >= 0) {
				count++;
				f+=2;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}
