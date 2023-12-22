import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		long ans = 0;

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		long added = 0;
        for (int i = n - 1; i >= 0; i--) {
            long cur = a[i] + added;
            if (cur % b[i] == 0) {
                continue;
            }
            added += b[i] - (cur % b[i]);
        }
        System.out.println(added);
	}
}
