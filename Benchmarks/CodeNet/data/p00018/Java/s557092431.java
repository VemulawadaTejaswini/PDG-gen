import java.util.*;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [5];
		for (int i=0;i<5;i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		for (int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]);
			if (i != 0)System.out.print(" ");
			else System.out.println();
		}
	}
	
	public static void main (String[] args) {
		new Main().run();
	}
}