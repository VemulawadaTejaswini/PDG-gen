import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int[] b = new int[m];
			for(int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}

			int head = 0;
			int foot = n - 1;
			for(int i = 0; i < m; i++) {
				while(head <= foot) {
					int mid = (head + foot) / 2;
					if(a[mid] == b[i]) {
						head = mid + 1;
						foot = n - 1;
						if(i == m-1) {
							System.out.println(1);
							return;
						}
						break;
					}
					else if(a[mid] < b[i]) {
						head = mid + 1;
					}
					else {
						foot = mid - 1;
					}
				}
			}
			System.out.println(0);
		}
	}
}
