import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	void run() {
		for (;;) {
			double in = sc.nextDouble();
			if (in == 0) {
				break;
			}

			int denom = 1;
			boolean ok = false;
			for (;;) {
				for (int i = (int) (denom * Math.PI); i < denom * Math.PI + 1; i++) {
					if (Math.abs((double) i / denom - Math.PI) < in) {
						ok = true;
					}
				}
				if(ok){
					break;
				}
				denom++;
			}
			double min = in;
			int  index = 0;
			for (int i = (int) (denom * Math.PI); i < denom * Math.PI + 1; i++) {
				if (Math.abs((double) i / denom - Math.PI) < min) {
					min = Math.abs((double) i / denom - Math.PI);
					index = i;
				}
			}
			System.out.println(index+"/"+denom);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}