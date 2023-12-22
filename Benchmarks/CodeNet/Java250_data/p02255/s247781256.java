import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ints = new int[n];
		for (int i=0; i<n; i++) {
			ints[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			int v = ints[i];
			int j = i - 1;
			while (j>=0 && ints[j]>v) {
				ints[j+1] = ints[j];
				j--;
			}
			ints[j+1] = v;
			print(ints);
		}
	}
	
	static void print (int num[]) {
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]);
			if (i!=num.length-1) {System.out.print(" ");}
		}
		System.out.println();
	}
}				
