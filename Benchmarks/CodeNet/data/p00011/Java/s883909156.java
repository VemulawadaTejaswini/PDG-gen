import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		int[] a = new int[w+1];
		for(int i=1; i<=w; i++) a[i]=i;
		
		while(n-- != 0) {
			String[] s = sc.next().split(",");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int std = a[x];
			a[x] = a[y];
			a[y] = std;
		}
		for(int i=1; i<=w; i++) System.out.println(a[i]);
	}
}

