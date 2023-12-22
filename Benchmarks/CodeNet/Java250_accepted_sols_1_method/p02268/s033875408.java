import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] l1 = new int[n];
		for (int i = 0; i < n; i++) {
			l1[i] = sc.nextInt();
		}
		Arrays.sort(l1);
		
		int q = sc.nextInt();
		int[] l2 = new int[q];
		for (int i = 0; i < q; i++) {
			l2[i] = sc.nextInt();
		}
		Arrays.sort(l2);
		
		int count = 0;
		
		for (int i = 0, j = 0; i<n && j<q; i++) {
			if (l1[i] == l2[j]) {
				count++;
				j++;
			}else if (l1[i]>l2[j]) {
				i--;
				j++;
			}
		}
		
		System.out.println(count);
		
		
		
	}
}
