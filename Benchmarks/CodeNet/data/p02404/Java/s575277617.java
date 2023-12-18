import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String u, nl = System.getProperty("line.separator");
		StringBuilder 
			p = new StringBuilder(1024),
		  	d = (new StringBuilder(128)).append("."),
		  	s = (new StringBuilder(128)).append("#"),
		  	k = new StringBuilder(128);
		Scanner r = new Scanner(System.in);
		int h, w, ww = 0x10;
		while (0 != (ww >>= 1)) {
			d.append(d);
			s.append(s);
		}
		ww = d.length();
		while (0 != ((h = r.nextInt()) | (w = r.nextInt()))) {
			while (w > ww) {
				d.append(d);
				s.append(s);
				ww = d.length();
			}
			p.append(u = s.substring(0, w)).append(nl);
			k.setLength(0);
			k.append(d.substring(0, w)).append(nl)
			.replace(0, 1, "#").replace(w - 1, w, "#");
			while (2 != h--) {
				p.append(k);
			}
			p.append(u).append(nl).append(nl);
		}
		System.out.print(p);
	}
}