import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = new char[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			switch (a / 400) {
				case 0 :
				arr[i] = 'a';
				break;
				case 1 :
				arr[i] = 'b';
				break;
				case 2 :
				arr[i] = 'c';
				break;
				case 3 :
				arr[i] = 'd';
				break;
				case 4 :
				arr[i] = 'e';
				break;
				case 5 :
				arr[i] = 'f';
				break;
				case 6 :
				arr[i] = 'g';
				break;
				case 7 :
				arr[i] = 'h';
				break;
				default :
				arr[i] = 'x';
				break;
			}
		}
		Arrays.sort(arr);
		int cCount = 0;
		int xCount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'x') {
				xCount++;
			} else {
				if (i == 0) {
					cCount++;
				} else if (arr[i - 1] != arr[i]) {
					cCount++;
				}
			}
		}
		int min = cCount;
		if (min == 0) {
			min = 1;
		}
		int max = cCount + xCount;
		System.out.println(min + " " + max);
	}
}
