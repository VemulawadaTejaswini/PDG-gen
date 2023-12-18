import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt(), w= in.nextInt();
		boolean[] ff = new boolean[h];
		String[] a = new String[h]; in.nextLine();
		for(int i = 0; i < h; i++ ){
			a[i] = in.nextLine();
		}
		for(int i = 0; i < h; i++){
			ff[i] = false;
			for(int k = 0; k < w; k++) {
				if(a[i].charAt(0) == '#' || a[i].charAt(0) != a[i].charAt(k)) {
					ff[i] = true;
					break;
				}
			}
		}
		for(int i = 0; i < w; i++) {
			boolean f = true;
			for(int k = 0; k < h; k++) {
				if(a[0].charAt(i) == '#' || a[0].charAt(i) != a[k].charAt(i)) {
					f = false;
				}
			}
			// System.out.println(f);
			if(f) {
				for(int k = 0; k < h; k++) {
					// System.out.println(i);
					a[k] = a[k].substring(0, i) + a[k].substring(i + 1);
				}
				w--;
				i--;
			}
		}
		// System.out.println(w);
		for(int i = 0; i < h; i++){
			if(ff[i]) {	
				System.out.println(a[i]);
			}
		}
	}
}
	
