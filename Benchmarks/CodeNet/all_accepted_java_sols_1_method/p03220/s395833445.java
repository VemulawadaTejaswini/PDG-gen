import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		int te = t.nextInt();
		int a = t.nextInt();
		double max = Math.abs((te - (t.nextInt()*0.006) - a));
		int pos = 1;
		for(int x=2;x<=n;x++){
			double h = (te - (t.nextInt()*0.006) - a);
			h = Math.abs(h);
			if (max >= h) {
				max = h;
				pos = x;
			}
		}		
		System.out.println(pos);
	}

}