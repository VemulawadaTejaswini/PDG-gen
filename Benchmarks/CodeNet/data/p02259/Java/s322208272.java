import java.io.IOException;
import java.util.Scanner;
public class Main {
	static int count;
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[] a = new int[x];

		for(int i=0;i<x;i++) {
			a[i] = sc.nextInt();
		}

		bubbleSort(a, x);
		show(a, x, count);
		sc.close();
	}

	public static void bubbleSort(int[] a, int x) {
		boolean flag = true;
		count = 0;
		while(flag) {
			flag = false;
			for(int i=x-1;i>0;i--) {
				if(a[i]<a[i-1]) {
					int tmp = a[i];
					a[i] = a[i-1];
					a[i-1] = tmp;
					flag = true;
					count++;
				}
			}
		}
	}

	public static void show(int[] a, int x, int count2) {
		for(int i=0;i<x;i++) {
			System.out.print(a[i]);
			if(i!=x-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
