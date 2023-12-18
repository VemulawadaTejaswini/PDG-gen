import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aka = Integer.parseInt(sc.next());
		int midori = Integer.parseInt(sc.next());
		int ao = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		int count = 0;
		while(true) {
			count++;
			if(ao<=midori) {
				ao = ao*2;
			} else if(midori <= aka) {
				midori = midori *2;
			}
			if(count == K) break;
		}
		if(ao > midori && midori > aka) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}