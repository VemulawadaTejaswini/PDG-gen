
import java.util.Scanner;

public class Main{
	static int[] num;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		num = new int[count];
		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}
		quickSort(0 ,count  - 1, num);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < count; i++) {
			sb.append(num[i] + " ");
		}
		System.out.print(sb.toString().trim());
		System.out.println("");
	}
	
	public static void quickSort(int bottom, int top, int[] num) {
		int lower ,upper;
		if (bottom >= top)
			return;
		
		int div = num[bottom];
		for (lower = bottom, upper = top; lower < upper;) {
			while (lower <= upper && num[lower] <= div)
				lower++;
			
			while (lower <= upper && num[upper] > div)
				upper--;
			if (lower < upper) {
				int temp = num[lower];
				num[lower] = num[upper];
				num[upper] = temp;
			}
		}
		
		int temp = num[bottom];
		num[bottom] = num[upper];
		num[upper] = temp;
		
		quickSort(bottom, upper -1 ,num);
		quickSort(upper+1 ,top ,num);
	}
}