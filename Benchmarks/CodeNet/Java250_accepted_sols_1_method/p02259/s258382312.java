import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		
		int chtimes = 0;
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int j = n-1; j >= 1; j--) {
				if(a[j] < a[j-1]) {
					flag = true;
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					chtimes++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println("\n" + chtimes);
	}
}
