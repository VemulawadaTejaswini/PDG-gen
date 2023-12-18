import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int max1 = 0;
		int max2 = 0;
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
			if(a[i]>max1) {
				max2 = max1;
				max1 = a[i];
			}else if(a[i]>max2) {
				max2 = a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]==max1) System.out.println(max2);
			else System.out.println(max1);
		}
		
		in.close();

	}

}
