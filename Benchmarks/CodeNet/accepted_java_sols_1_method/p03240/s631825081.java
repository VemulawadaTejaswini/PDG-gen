import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hi = 0;
		ArrayList<Integer> xlist = new ArrayList<Integer>();
		ArrayList<Integer> ylist = new ArrayList<Integer>();
		ArrayList<Integer> hlist = new ArrayList<Integer>();
		for ( int i = 0; i < n; i++ ) {
			xlist.add(in.nextInt());
			ylist.add(in.nextInt());
			hlist.add(in.nextInt());

			if ( hlist.get(i) != 0 ) hi = i;
		}
		in.close();

		for ( int cy = 0; cy <= 100; cy++ ) {
			for ( int cx = 0; cx <= 100; cx++ ) {
				boolean match = true;
				int Height = hlist.get(hi) + Math.abs(xlist.get(hi) - cx) + Math.abs(ylist.get(hi) - cy);
				
				for ( int i = 0; i < hlist.size(); i++ ) {					
					if(hlist.get(i) != 0) {
						int tempH = hlist.get(i) + Math.abs(xlist.get(i) - cx) + Math.abs(ylist.get(i) - cy);
						if ( Height != tempH ) {
							match = false;
							break;
						} else {
							Height = tempH;							
						}						
					}
					
					if(hlist.get(i) == 0 && Height > Math.abs(xlist.get(i) - cx) + Math.abs(ylist.get(i) - cy)) {
						match = false;
						break;
					}
				}
				if ( match ) {
					System.out.println(cx + " " + cy + " " + Height);
					return;
				}
			}
		}
	}
}
