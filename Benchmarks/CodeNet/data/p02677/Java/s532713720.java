import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		double argA = (double) (60 * h + m) / 2;
		double argB = 6 * m;
		double ax = 0;
		double ay = 0;
		double bx = 0;
		double by = 0;
		
		if (argA >= 0 && argA <= 90) {
		    ax = a * Math.cos(Math.toRadians(90 - argA));
		    ay = a * Math.sin(Math.toRadians(90 - argA));
		} else if (argA > 90 && argA <= 180) {
		    ax = a * Math.cos(Math.toRadians(argA - 90));
		    ay = -a * Math.sin(Math.toRadians(argA - 90));
		} else if (argA > 180 && argA <= 270) {
		    ax = -a * Math.cos(Math.toRadians(270 - argA));
		    ay = -a * Math.sin(Math.toRadians(270 - argA));
		} else if (argA > 270 && argA <= 360) {
		    ax = -a * Math.cos(Math.toRadians(argA - 270));
		    ay = a * Math.sin(Math.toRadians(argA - 270));
		}
		
		if (argB >= 0 && argB <= 90) {
		    bx = b * Math.cos(Math.toRadians(90 - argB));
		    by = b * Math.sin(Math.toRadians(90 - argB));
		} else if (argB > 90 && argB <= 180) {
		    bx = b * Math.cos(Math.toRadians(argB - 90));
		    by = -b * Math.sin(Math.toRadians(argB - 90));
		} else if (argB > 180 && argB <= 270) {
		    bx = -b * Math.cos(Math.toRadians(270 - argB));
		    by = -b * Math.sin(Math.toRadians(270 - argB));
		} else if (argB > 270 && argB <= 360) {
		    bx = -b * Math.cos(Math.toRadians(argB - 270));
		    by = b * Math.sin(Math.toRadians(argB - 270));
		}
		
		double result = (double) Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
		
		System.out.println(result);
	}
}