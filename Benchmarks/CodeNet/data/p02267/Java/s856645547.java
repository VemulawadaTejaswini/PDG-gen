import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n, q;
		int[] s;
		int t;
		int j;
		int ans = 0;

		n = scan.nextInt();
		s = new int[n];
		for(int i = 0; i <= n - 1; i++){
			s[i] = scan.nextInt();
		}
		
		q = scan.nextInt();
		for(int i = 0; i < q; i++){
			t = scan.nextInt();
			ans += linearSearch(s, t);
		}
		System.out.println(ans);
	}
	
	public static int linearSearch(int[] a, int key){
		int i = 0;
		a[a.length - 1] = key;
		while(a[i] != key){
			i++;
			if(i == a.length - 1)return 0;
		}
		return 1;
	}
}