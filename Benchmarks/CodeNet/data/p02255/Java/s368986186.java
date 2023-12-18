import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arrayIn = new int[N];

		for(int i=0;i<arrayIn.length;i++) {
			arrayIn[i] = sc.nextInt();
			if(i==N-1) {
				System.out.print(arrayIn[i]);
			}else {
				System.out.print(arrayIn[i]+" ");
			}
		}
		System.out.println();

		sort(arrayIn);

	}

	public static int[] sort(int[] arrayIn) {

		for(int i=1;i<arrayIn.length;i++) {
			int v = arrayIn[i];

			for(int j=i-1;j>=0;j--) {
				if(arrayIn[j] > v) {
					arrayIn[j+1] = arrayIn[j];
					arrayIn[j] = v;
				}
			}
			for(int k:arrayIn) {
				if(k==arrayIn[arrayIn.length-1]) {
					System.out.print(k);
				}else {
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}
		return arrayIn;
	}
}

