import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count_mount = sc.nextInt();
		int[] mounts = new int[count_mount];
		for (int i = 0; i < count_mount; i++) {
			mounts[i] = sc.nextInt();
		}
		sc.close();
		int count = 1;
		int max = mounts[0];
		for (int i = 1; i < count_mount; i++) {
			if (mounts[i] >= max) {
				max = mounts[i];
				count++;
			}
		}
		System.out.println(count);
	}
}