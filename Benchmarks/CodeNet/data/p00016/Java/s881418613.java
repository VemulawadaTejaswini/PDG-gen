import java.util.Scanner;

public class Main {
	private double x = 0, y = 0, angle = 0;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			int i = str.indexOf(",");
			int step = Integer.parseInt(str.substring(0, i));
			int angle = Integer.parseInt(str.substring(i+1, str.length()));
			
			if ((step | angle) == 0) break;
			
			this.x += step * Math.sin(this.angle * Math.PI / 180);
			this.y += step * Math.cos(this.angle * Math.PI / 180);
			
			this.angle += angle;
		}
		System.out.println((int)this.x);
		System.out.println((int)this.y);
	}
	
	private void debug() {
		System.out.println();
	}

}