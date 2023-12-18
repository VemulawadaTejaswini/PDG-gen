import java.io.*;
import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		PrintWriter o = new PrintWriter(new BufferedOutputStream(System.out));
		boolean f = false;

		int h,w;
		while(s.hasNext()) {

			if(f) {
				o.print("\n");
			}
			f=true;

			h = Integer.parseInt(s.next());
			w = Integer.parseInt(s.next());
			if((h|w)==0)
				return;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					o.print("#");
				}
				o.print("\n");
			}
			o.flush();
		}
	}
}