import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[3];
		Scanner cin = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			a[i] = cin.nextInt();
		}
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				int temp = 0;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}
