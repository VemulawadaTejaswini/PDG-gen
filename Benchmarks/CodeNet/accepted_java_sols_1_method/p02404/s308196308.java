import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String nl = System.getProperty("line.separator");
		StringBuilder p = new StringBuilder(3000);
		StringBuilder d = new StringBuilder("....");
		StringBuilder s = new StringBuilder("####");
		Scanner r = new Scanner(System.in);
		int h, w, i, j, ww;
		String t;
		for (i = 0; i < 6; ++i) {
			d.append(d);
			s.append(s);
		}
		ww = d.length();
		while ((h = r.nextInt()) + (w = r.nextInt()) > 0) {
			while (w > ww) {
				d.append(d);
				s.append(s);
				ww += ww;
			}
			p.append(s.substring(0,w));
			p.append(nl);
			t = d.substring(0, w - 2);
			for (i = 2; i < h; ++i) {
				p.append('#');
				p.append(t);
				p.append('#');
				p.append(nl);
			}
			p.append(s.substring(0,w));
			p.append(nl);
			p.append(nl);
		}
		System.out.print(p);
	}
}