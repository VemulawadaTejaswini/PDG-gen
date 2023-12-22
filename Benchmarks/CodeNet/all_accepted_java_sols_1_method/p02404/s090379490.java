import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String nl = System.getProperty("line.separator");
		StringBuilder p = new StringBuilder(500);
		Scanner r = new Scanner(System.in);
		int h, w, i, j;
		while ((h = r.nextInt()) + (w = r.nextInt()) > 0) {
			for (i = h; i > 0; --i) {
				for (j = w; j > 0; --j) {
					if ((i == h)||(j == w)||(j == 1)||(i == 1)) {
						p.append('#');
					} else {
						p.append('.');
					}
				}
				p.append(nl);
			}
			p.append(nl);
		}
		System.out.print(p);
	}
}