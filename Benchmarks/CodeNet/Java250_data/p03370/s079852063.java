import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),ans=0,min=1000;
		int[] m = new int[n];
		for(int i=0; i<n; i++) {
			int g = sc.nextInt();
			x -= g;
			if(min > g) min = g;
			ans++;
		}
		System.out.println(x/min+ans);
	}
}
