import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		sc = null;
		int sum = 0;
		int min = 9;
		int tmp;
		boolean f=false;
		for(i=0; i<5; i++) {
			tmp = a[i] % 10;
			sum += (a[i] / 10) * 10;
			if(tmp > 0) {
				f=true;
				sum += 10;
				if(tmp < min) min = tmp;
			}
		}
		if(f)System.out.println(sum - 10 + min);
		else System.out.println(sum);
	}
}