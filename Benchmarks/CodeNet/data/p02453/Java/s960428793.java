import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();

			for(int i = 0; i < q; i++) {
				int head = 0;
				int foot = n - 1;
				int target = sc.nextInt();
				int result = n;
				if(target <= a[0])
					result = 0;
				else while(head <= foot) {
					int mid = (head + foot) / 2;
					if(a[mid] < target) {
						if(mid < n - 1 && a[mid+1] >= target) {
							result = mid + 1;
							break;
						}
						else {
							head = mid + 1;
						}
					}
					else {
						foot = mid - 1;
					}
				}
				System.out.println(result);
			}
		}
	}
}
