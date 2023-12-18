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

			if(array[n-1] < key) System.out.println(n);  //クラスで弾いてもよいが...
			else {
				BinarySearch3 bi3 = new BinarySearch3();
				bi3.binarySearch3(array, key);
			}
		}
	}
}

//BinarySeachをLowerBoundを返すように改良したクラス
class BinarySearch3 {
	public void binarySearch3(int[] array, int key) {
		int pLeft = 0;
		int pRight = array.length - 1;
		int center;
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

		System.out.println(center);
	}
}
