import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] a = new String[h + 2] ;
		for(int i = 0; i <= h + 1; i++) {
			a[i] = "#";
		}
		for(int i = 1; i <= w; i++) {
			a[0] += "#";
			a[h + 1] += "#";
		}
		for(int i = 1; i <= h; i++) a[i] += sc.next();
		for(int i = 0; i <= h + 1; i++) {
			a[i] += "#";
		}
		for(int i = 0; i <= h + 1; i++) {
			System.out.println(a[i]);
		}
	}

}