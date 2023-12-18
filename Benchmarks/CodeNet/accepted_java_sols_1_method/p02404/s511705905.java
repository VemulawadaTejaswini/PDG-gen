import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String nl = System.getProperty("line.separator");
		StringBuilder p = new StringBuilder(1000);
		StringBuilder d = new StringBuilder(".");
		StringBuilder s = new StringBuilder("#");
		StringBuilder k = new StringBuilder(50);
		Scanner r = new Scanner(System.in);
		int h, w, i, ww;
		String t, u;
		for (i = 0; i < 4; ++i) {
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
			p.append(u = s.substring(0,w));
			p.append(nl);
			k.setLength(0);
			k.append('#');
			k.append(d.substring(2, w));
			k.append('#');
			k.append(nl);
			for (i = h - 2; i > 0; --i) {
				p.append(k);
			}
			p.append(u);
			p.append(nl);
			p.append(nl);
		}
		System.out.print(p);
	}
}