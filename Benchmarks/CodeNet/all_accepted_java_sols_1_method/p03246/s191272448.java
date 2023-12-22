


import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] even = new int[100001];
		int[] odd = new int[100001];
		for (int i=0;i<n;i++) {
			int tmp = sc.nextInt();
			if (i%2==0) {
				even[tmp]++;
			} else {
				odd[tmp]++;
			}
		}
		int [] newEven = new int[100001];
		int [] newOdd = new int[100001];
		System.arraycopy(even, 0, newEven, 0, 100001); 
		System.arraycopy(odd, 0, newOdd, 0, 100001);
		
		Arrays.sort(newEven);
		Arrays.sort(newOdd);
		
		if(newEven[100000]==newEven[99999] || newOdd[100000]==newOdd[99999]) {
			System.out.println(n-newEven[100000]-newOdd[100000]);
		} else {
			int evenMax = 0;
			int oddMax = 0;
			for (int i=0;i<=100000;i++) {
				if (even[i]==newEven[100000]) {
					evenMax = i;
				}
				if (odd[i]==newOdd[100000]) {
					oddMax  = i;
				}
			}
			
			if (evenMax==oddMax) {
				System.out.println(Math.min(n-newEven[100000]-newOdd[99999], n-newEven[99999]-newOdd[100000]));
			} else {
				System.out.println(n-newEven[100000]-newOdd[100000]);
			}
		}
	}
}
