import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int count = 0;

		for(int i=L;i<=R;i++) {
			if(i%d==0)count++;
		}
		System.out.println(count);

	}
}