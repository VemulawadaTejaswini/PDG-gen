import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
	 double min_v = in.nextDouble();
	 double t = min_v / 9.8;
	 double y = t * t * 4.9;
	 double n2 = (y + 5) / 5;
	 if (n2 % 1.0d != 0.0) n2+=1;
	 System.out.println((int)n2);
	}
 }
}