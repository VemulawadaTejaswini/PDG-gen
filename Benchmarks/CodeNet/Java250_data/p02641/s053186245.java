import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b==0) {
			System.out.println(a);
			return;
		}
		int [] c = new int[b];
		String str = sc.nextLine();
		int min = 100;
		int ans = 0;
		for (int i=0; i<b; i++) {
			c[i]= sc.nextInt();
		}
		int f = 0;
		for (int i=-101; i<201; i++) {
			for (int j=0; j<b; j++) {
				if (c[j]==i) {
					f = 1;
					break;
				}
			}
			if (f == 0) {
				if(Math.abs(i-a) < min) {
					min = Math.abs(i-a);
					ans = i;
				}
			} else {
				f = 0;
			}
		}

		sc.close();
		System.out.println(ans);
	}
}
