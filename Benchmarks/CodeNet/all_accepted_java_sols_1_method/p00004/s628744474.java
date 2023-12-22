import java.util.*;
public class Main {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextFloat()) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			float d = sc.nextFloat();
			float e = sc.nextFloat();
			float f = sc.nextFloat();
			float z = a*e - b*d;
			float x = (c * e - f * b)/z;
			float y = (a * f - d * c)/z;
			x = x == -0.0f ? 0.0f : x;
			y = y == -0.0f ? 0.0f : y;
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}