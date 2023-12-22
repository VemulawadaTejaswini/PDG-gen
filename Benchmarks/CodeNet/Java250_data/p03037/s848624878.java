import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []l = new int [m];
		int []r = new int [m];
		int maxL = 0;
		int minR = 100000;
		for(int i = 0; i < m ; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			maxL = Math.max(maxL, l[i]);
			minR = Math.min(minR, r[i]);
			
		}
		if(minR >= maxL) {
		System.out.println((minR - maxL + 1));
		}
		if(minR < maxL) {
	    System.out.println(0);
		}
		

	}

}
