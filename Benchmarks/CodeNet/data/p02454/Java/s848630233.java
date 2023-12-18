import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			int key = sc.nextInt();

			if(array[n-1] < key) {
				System.out.print(n + " ");
				System.out.println(n);
			}
			else {
				BinarySearch4 bi4 = new BinarySearch4();
				bi4.binarySearch3(array, key);

				if(array[n-1] == key) System.out.println(n);
				else {
					//upperbound
					bi4.binarySearch4(array, key);
				}
			}
		}
	}
}

class BinarySearch4 {
	int center;

	public void binarySearch3(int[] array, int key) {
		int pLeft = 0;
		int pRight = array.length - 1;
		int temp = -1;

		do {
			center = (pLeft + pRight) / 2;
			if(center == temp) break;

			if (array[center] >= key) {  //key以上の数がarray[center]より前にある可能性がある
				pRight = center;
			} else {
				pLeft = center + 1;  //ここはok
			}
			temp = center;
		} while (pLeft <= pRight);

		System.out.print(center + " ");
	}

	public void binarySearch4(int[] array, int key) {
		int pLeft = center;
		int pRight = array.length - 1;
		int temp = -1;

		do {
			center = (pLeft + pRight) / 2;
			if(center == temp) break;

			if (array[center] > key) {
				pRight = center;
			} else {
				pLeft = center + 1;  //ここはok
			}
			temp = center;
		} while (pLeft <= pRight);

		System.out.println(center);
	}
}
