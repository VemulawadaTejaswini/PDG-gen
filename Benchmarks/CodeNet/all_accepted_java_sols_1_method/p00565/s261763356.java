import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			int max1 = 0;
			int count = 0;
			for (int i=0; i<len; i++) {
				if (sc.nextInt() == 1) {
					count++;
				} else {
					max1 = Math.max(max1, count);
					count = 0;
				}
				max1 = Math.max(max1, count);
			}
			System.out.println(max1+1);
		}
	}
}
