import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i = n-1; i >= 0; i-=2)
			ans.append(a[i]+" ");
		int x = n % 2 == 0 ? 0 : 1;
		for(int i = x; i < n; i+=2)
			ans.append(a[i]+" ");
		ans.deleteCharAt(ans.length()-1);
		System.out.println(ans);
	}

}
