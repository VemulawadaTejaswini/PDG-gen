import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        	a[i] = sc.nextInt();

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
        	if(solve(a, sc.nextInt(), 0))
        		System.out.println("yes");
        	else
        		System.out.println("no");
        }
        sc.close();
	}

	static boolean solve(int[] a, int ans, int i) {
		if(ans == 0)
			return true;

		if(i >= a.length)
			return false;

		return solve(a, ans, i + 1) || solve(a, ans - a[i], i + 1);
	}
}

