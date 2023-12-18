/**
 * @author yuichirw
 *
 */
import java.util.*;
import java.util.GregorianCalendar;

public class Main {
	static int n, j;
	static int[] a,b;
	static Scanner sc = new Scanner(System.in);
	static GregorianCalendar cal = new GregorianCalendar();
	
	static void read() {
		n = 0;
		a = new int[1000]; b = new int[1000];
		for(int i = 0;;i++) {
			a[i] = sc.nextInt(); b[i] = sc.nextInt();
			if(a[i] == 0 && b[i] == 0) break;
			n++;
		}
	}
	
	static void solve() {
		boolean none = true;
		for(int year = a[j]; year <= b[j]; year++) {
			if(cal.isLeapYear(year)) {
				System.out.println(year);
				none = false;
			}
		}
		if(none) {
			System.out.println("NA");
		}
	}
	
	public static void main(String[] args) {
		read();
		for(j = 0; j < n; j++) {
			solve();
			if(j != n-1) {
				System.out.println("");
			}
		}
	}
}