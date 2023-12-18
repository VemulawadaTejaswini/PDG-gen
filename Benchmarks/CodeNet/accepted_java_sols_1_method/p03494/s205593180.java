import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}


		int count = 0;
		//配列の要素の1つでも奇数なら2で割らない

		while(true) {
			Boolean b = true;
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 != 0) {
					b = false;		//奇数
				}
			}

			if (!b) {
				break;
			}

			for (int j = 0; j < a.length; j++) {
				a[j] = a[j] / 2;
			}
			count++;
		}



		System.out.println(count);
	}

}
