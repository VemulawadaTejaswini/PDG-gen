import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		//int ans = 1;
		long ansl = 1;
		boolean f = true;
		/*try {
			*/for (int i = 0; i < n; i++) {
				int temp = sc.nextInt();
				if (temp == 0) {
                  	System.out.println(0);
                  	f=false;
					break;
				}
				ansl *= temp;
				//ans = (int) ansl;
			}/*

		} catch (InputMismatchException e) {
			System.out.println(-1);
			f=false;
		}*/
		if (ansl <= (long) Math.pow(10, 18)&&f) {
			System.out.println(ansl);
		} else {
			if(f||ansl<0)
			System.out.println(-1);
		}

	}
}