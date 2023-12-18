import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a[] = new long[6];
		long mini = -5;
		for (int i = 1; i <= 5; i++) {
			a[i] = sc.nextLong();

		}
		mini = a[1];
		for (int i = 1; i <= 5; i++) {

			if (mini > a[i]) {
				mini = a[i];
			}
		}


		if(n%mini!=0){
			n=n+(mini-n%mini);
		}
System.out.println(n/mini+4);

	}
}
