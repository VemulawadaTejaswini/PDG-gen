import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] card1 = new String[36];
		String[] card2 = new String[36];
		
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			card1[i] = stdIn.next();
		}
		
		for (int i = 0; i < n; i++)
			card2[i] = card1[i];
		
		
		BubbleSort(card1, n);
		SelectionSort(card2, n);
		
		System.out.print(card1[0]);
		for (int i = 1; i < n; i++)
			System.out.print(" " +card1[i]);
		System.out.println();
		System.out.println("Stable");
		
		System.out.print(card2[0]);
		for (int i = 1; i < n; i++)
			System.out.print(" " +card2[i]);
		System.out.println();
		
		if (isStable(card1, card2, n))
			System.out.println("Stable");
		else
			System.out.println("Not stable");
	}
	
	public static void BubbleSort(String[] a, int n) {
		int flag = 1, i;
		String t;
		while (flag != 0) {
			flag = 0;
			for (i = n - 1; i > 0; i--) {
				if (a[i].charAt(1) < a[i-1].charAt(1)) {
					t = a[i];
					a[i] = a[i-1];
					a[i-1] = t;
					flag = 1;
				}
			}
		}
	}
	
	public static void SelectionSort(String[] a, int n) {
		int i, j, minat;
		String t;
		for (i = 0; i < n; i++) {
			minat = i;
			for (j = i + 1; j < n; j++)
				if (a[j].charAt(1) < a[minat].charAt(1))
					minat = j;
			if (i != minat) {
				t = a[i];
				a[i] = a[minat];
				a[minat] = t;
			}
		}
	}
	
	public static boolean isStable(String[] a, String[] b, int n) {
		for (int i = 0; i < n; i++)
			if (a[i].charAt(0) != b[i].charAt(0))
				return false;
		return true;
	}
}