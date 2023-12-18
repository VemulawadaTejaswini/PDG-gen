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
		StringBuilder k = new StringBuilder(100);
		Scanner r = new Scanner(System.in);
		int h, w, ww;
		String u;
		for (w = 0; w < 4; ++w) {
			d.append(d);
			s.append(s);
		}
		ww = d.length();
		while ((h = r.nextInt()) + (w = r.nextInt()) > 0) {
			for (; w > ww; ww += ww) {
				d.append(d);
				s.append(s);
			}
			p.append(u = s.substring(0,w)).append(nl);
			k.setLength(0);
			k.append(d.substring(0, w)).append(nl)
			.replace(0, 1, "#").replace(w - 1, w, "#");
			for ( ; h > 2; --h) {
				p.append(k);
			}
			p.append(u).append(nl).append(nl);
		}
		System.out.print(p);
	}
}