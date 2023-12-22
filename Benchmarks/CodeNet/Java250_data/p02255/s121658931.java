import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] sorted = new int[n];
		for(int i = 0; i < n; i++) {
			sorted[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++) {
			int temp = sorted[i];
			int j = i-1;
			while(j >= 0 && temp < sorted[j]) {
				sorted[j+1] = sorted[j];
				j--;
			}
			sorted[j+1] = temp;
			for(int a = 0; a < sorted.length; a++) {
				if(a == sorted.length - 1) System.out.print(sorted[a]);
				else System.out.print(sorted[a] + " ");
			}
			System.out.println();
		}
	}

}

