import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			double ax = scanner.nextDouble();
			double ay = scanner.nextDouble();
			double bx = scanner.nextDouble();
			double by = scanner.nextDouble();
			double cx = scanner.nextDouble();
			double cy = scanner.nextDouble();
			double px = scanner.nextDouble();
			double py = scanner.nextDouble();

			double sitaAB = Math.acos(prod(ax-px, ay-py, bx-px, by-py) / (range(ax, ay, px, py) * range(bx, by, px, py)));
			double sitaBC = Math.acos(prod(bx-px, by-py, cx-px, cy-py) / (range(bx, by, px, py) * range(cx, cy, px, py)));
			double sitaCA = Math.acos(prod(cx-px, cy-py, ax-px, ay-py) / (range(cx, cy, px, py) * range(ax, ay, px, py)));
			if((sitaAB + sitaBC + sitaCA) == Math.PI*2){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	
	public static double prod(double x1, double y1, double x2, double y2){
		return ((x1*x2) + (y1*y2));
	}
	public static double range(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
}