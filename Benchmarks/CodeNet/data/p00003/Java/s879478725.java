import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int n, m, i;
	static int a[] = new int[3];

	public static void main(String[] args) {
		
		while(read())
		{	
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext()) return false;
		if(n == m) n = sc.nextInt();
		
		for(i=0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		return true;
	}
	
	static void solve(){
		
		if(a[0] * a[0] == a[1] * a[1] + a[2] * a[2] ||
		   a[1] * a[1] == a[0] * a[0] + a[2] * a[2] ||
		   a[2] * a[2] == a[0] * a[0] + a[1] * a[1])
		{
			System.out.println("YES");
			return;
		}
		
		System.out.println("NO");
	}

}