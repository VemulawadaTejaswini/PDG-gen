import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		int pmin = 0;
		int jmin = 0;
		int set = 0;
		pmin = Math.min(p1, p2);
		pmin = Math.min(pmin, p3);
		jmin = Math.min(j1, j2);
		set = pmin+jmin-50;
		System.out.println(set);
	}
}