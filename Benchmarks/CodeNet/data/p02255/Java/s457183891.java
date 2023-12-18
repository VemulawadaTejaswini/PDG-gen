import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		insertionSort(num);

	}

	public static void insertionSort(int[] num) {

		for (int i = 1; i < num.length; i++) {
			int v = num[i];
			//基本数据类型赋的是值
			//System.out.println(v);
			int j = i - 1;
			while (j >= 0 && num[j] > v) {
				num[j + 1] = num[j];
				j--;
			//	System.out.println(v);
			}
//可以两个不同的变量名指向同一个变量，但当改变一个变量时，另一个不会改变。
			num[j + 1] = v;
			for (int k = 0; k < num.length; k++) {
				if (k > 0) {
					System.out.print(" ");
				}
				System.out.print(num[k]);
			}
			System.out.println();
		}
	}

}

