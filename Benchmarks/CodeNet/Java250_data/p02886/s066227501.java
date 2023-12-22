import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int[] takoyaki = new int[num];
			long aji = 0;
			for (int i = 0; i < num; i++) {
				int temp = sc.nextInt();
				takoyaki[i] = temp;
				aji += temp;
			}
			long sum = 0;
			for (int i = 0; i < num; i++) {
				long other = aji - takoyaki[i];
				sum += other * takoyaki[i];
				aji -= takoyaki[i];
			}
			System.out.print(sum);
		}
	}
}
