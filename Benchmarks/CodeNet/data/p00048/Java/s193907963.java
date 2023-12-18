import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	double[] weight = { 48.0, 51.0, 54.0, 57.0, 60.0, 64.0, 69.0, 75.0, 81.0, 91.0 };
	String[] name = { "light fly", "fly", "bantam", "feather", "light", "light welter", "welter", 
			          "light middle", "middle", "light heavy", "heavy" };
	void run() {
		while (sc.hasNext()) {
			rank(sc.nextDouble());
			
		}
	}
	
	void rank(double w) {
		for(int i=0;i<weight.length;i++) {
			if (w <= weight[i]) {
				System.out.println(name[i]);
				return;
			}
		}
		System.out.println(name[name.length-1]);
	}
	public static void main(String[] str) {
		new Main().run();
	}
}