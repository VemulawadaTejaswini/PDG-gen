import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int n, m, i=0;
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
		
		a[i] = sc.nextInt();
		i++;
		
		return true;
	}
	
	static void solve(){
		if(i != 3) return;
		
		System.out.println((a[0] * a[0] == a[1] * a[1] + a[2] * a[2] ||
		   a[1] * a[1] == a[0] * a[0] + a[2] * a[2] ||
		   a[2] * a[2] == a[0] * a[0] + a[1] * a[1])
		   ?"YES":"NO");
		i=0;
	}

}