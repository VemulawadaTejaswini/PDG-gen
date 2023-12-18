import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run() {
		while (sc.hasNext()) {
			String str = sc.next();
			String[] spt = str.split(",");
			
			int[] seg = new int[10];
			int va,vb;
			double x,t;
			double p;
			for(int i=0;i<10;i++) seg[i] = Integer.parseInt(spt[i]);
			va = Integer.parseInt(spt[10]);
			vb = Integer.parseInt(spt[11]);
			x = 0;
			
			for(int i=0;i<10;i++) x += seg[i];
			
			t = x/(va+vb);
			
			p = t*va;
			int sum = 0;
			int i;
			for(i=0;i<10;i++) {
				sum += seg[i];
				if( p <= sum ) break;
			}
			System.out.println((i+1));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}