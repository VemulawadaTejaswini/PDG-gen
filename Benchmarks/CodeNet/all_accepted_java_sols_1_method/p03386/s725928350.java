import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int k = parseInt(sc.next());
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for (i = a; i <=b; i++) {
			if(i<a+k || b-k<i) {
				pw.println(i);
			}
		}
		pw.flush();
	}
}
