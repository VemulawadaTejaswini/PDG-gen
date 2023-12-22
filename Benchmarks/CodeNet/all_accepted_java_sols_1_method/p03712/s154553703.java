import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		String[] a = new String[h];
		for(i=0;i<h;i++) {
			a[i] = sc.next();
		}
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for(i = 0; i < w+1; i++) {
			pw.print("#");
		}
		pw.println("#");
		for(i = 0; i < h; i++) {
			pw.print("#");
			pw.print(a[i]);
			pw.println("#");
		}
		for(i = 0; i < w+1; i++) {
			pw.print("#");
		}
		pw.println("#");
		pw.flush();
	}
}
