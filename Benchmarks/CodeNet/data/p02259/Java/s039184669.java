import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ints = new int[n];
		for (int i=0; i<n; i++) {
			ints[i] = sc.nextInt();
		}
		
		int count = 0;
		while (true) {
			boolean flag = false;
			for (int i=0; i<n-1; i++) {
				if (ints[i] > ints[i+1]) {
					int temp = ints[i];
					ints[i] = ints[i+1];
					ints[i+1] = temp;
					flag = true;
					count++;
				}
			}
			if (flag==false) {break;}
		}
		
		for (int i=0; i<n; i++) {
			System.out.print(ints[i]);
			if (i!=n-1) {System.out.print(" ");}
		}
		System.out.println();
		System.out.println(count);
	}
}			
