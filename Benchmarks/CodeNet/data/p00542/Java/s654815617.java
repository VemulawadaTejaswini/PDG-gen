import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		int min = 100;
		int sum = 0;
		for (int i = 0;i < 4;++i) {
			a[i] = sc.nextInt();
			sum += a[i];
			min = Math.min(min, a[i]);
		}
		for (int i = 4;i < 6;++i) {
			a[i] = sc.nextInt();
		}
		System.out.println(sum - min + Math.max(a[4], a[5]));
	}
}

