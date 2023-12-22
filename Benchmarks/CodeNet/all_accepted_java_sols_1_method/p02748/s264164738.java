

import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] fridge = new int[a];
		int[] microwave = new int[b];

		
		int aMin = Integer.MAX_VALUE;
		int bMin = Integer.MAX_VALUE;
		for (int i=0;i<a;i++) {
			fridge[i]=sc.nextInt();
			aMin=Math.min(fridge[i],aMin);
		}
		for (int i=0;i<b;i++) {
			microwave[i]=sc.nextInt();
			bMin=Math.min(microwave[i],bMin);
		}
		
		int ans = aMin+bMin;
		for (int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			
			ans = Math.min(ans, fridge[x-1]+microwave[y-1]-c);
		}
		System.out.println(ans);
	}


}
