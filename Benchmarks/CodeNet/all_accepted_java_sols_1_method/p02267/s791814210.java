import java.util.Arrays;
import java.util.Scanner;
//Binary Search
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a1;
		int[] a2;
		a1 = new int[input.nextInt()];
		for(int i = 0; i < a1.length; i++) {
			a1[i] = input.nextInt();
		}
		a2 = new int[input.nextInt()];
		for(int i = 0; i < a2.length; i++) {
			a2[i] = input.nextInt();
		}
		input.close();
		if(a1.length > 10000 || a2.length > 500) {
			System.out.println("Enter a length less than of equal to 10000 for the first array,/n"
					+ "Enter a length less than or equal to 500 for the second array.");
		}
		else {
			int count = 0;
			Arrays.sort(a1);
			Arrays.sort(a2);

			
			for(int i = 0; i < a2.length; i++) {
				int first = 0;
				int last = a1.length - 1;
				int mid = (first + last)/2;
				while(first <= last) {
					if(a1[mid] < a2[i]) {
						first = mid + 1;
					}
					else if(a1[mid] == a2[i]) {
						count++;
						break;
					}
					else {
						last = mid - 1;
					}
					mid = (first + last)/2;
					
				}
			}
			System.out.println(count);
		}

	}

}

