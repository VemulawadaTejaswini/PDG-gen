import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int motosum = 0;
		int min = l;
		for (int i=0; i<n; i++) {
			motosum += (l + i);
			if (Math.abs(min) > Math.abs(l + i)) {
				min = l + i;
			}
		}
		
		System.out.println(motosum - min);

	}

}
