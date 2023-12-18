import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[3];
		int m;
		for(int i = 0;i < a.length;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i = 0;i < 3;i++) {
			m = i;
			for(int j = i+1;j < 3;j++) {
				if(a[m] > a[j])
					m = j;
			}
			int tmp = a[m];
			a[m] = a[i];
			a[i] = tmp;
		}
		for(int i = 0;i < a.length;i++) {
			System.out.print(a[i]);
			if(i < a.length-1)
				System.out.print(" ");
		}
		System.out.println("");
		scanner.close();
	}
}