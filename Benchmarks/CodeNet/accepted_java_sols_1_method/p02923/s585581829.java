import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		int n = ipt.nextInt(), tmp = 0, max = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ipt.nextInt();
		for (int i = 0; i < n - 1; i++) {
			if (a[i] >= a[i + 1])
				tmp++;
			else {
				if (max < tmp)
					max = tmp;
				tmp = 0;
			}
			if (max < tmp)
				max = tmp;
		}
		System.out.println(max);
		ipt.close();
	}
}