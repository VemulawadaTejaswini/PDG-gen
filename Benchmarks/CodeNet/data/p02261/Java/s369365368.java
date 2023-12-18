import java.util.Scanner;

public class Main {

	public static String[] bubbleSort(String[] a, int num) {
		String[] b = new String[num];
		String temp;

		for(int i = 0; i < num; i++) {
			b[i] = a[i];
		}

		for(int i = 0; i < num - 1; i++) {
			for(int j = num - 1; j >= i + 1; j--) {
				if(b[j-1].charAt(1) > b[j].charAt(1)) {
					temp = b[j-1];
					b[j-1] = b[j];
					b[j] = temp;
				}
			}
		}

		return b;
	}

	public static String[] selectionSort(String[] a, int num) {
		String[]	c = new String[num];
		int minIndex = 0;
		String temp;

		for(int i = 0; i < num; i++) {
			c[i] = a[i];
		}

		for(int i = 0; i < num; i++) {
			minIndex = i;
			for(int j = i; j < num; j++){
				if(c[j].charAt(1) < c[minIndex].charAt(1)) {
					minIndex = j;
				}
			}
			temp = c[i];
			c[i] = c[minIndex];
			c[minIndex] = temp;
		}


		return c;
	}

	public static boolean isStable(String[] b, String[] c, int num) {

		for(int i = 0; i < num; i++) {
			if(!b[i].equals(c[i])){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] a = new String[36];
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			a[i] = scan.next();
		}

		String[] b = bubbleSort(a, num);
		String[] c = selectionSort(a, num);

		for(int i = 0; i < num; i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(b[i]);
		}
		System.out.println("");
		System.out.println("Stable");

		for(int i = 0; i < num; i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(c[i]);
		}
		System.out.println("");
		if(isStable(b, c, num)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}






	}
}
