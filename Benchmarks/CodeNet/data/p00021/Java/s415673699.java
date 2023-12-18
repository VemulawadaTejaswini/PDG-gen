import java.util.Scanner;

public class Main {
static Scanner in = new Scanner(System.in);

public static void main(String[] args) {
  in.nextInt();
  while (in.hasNext()) {
	double x1 = getD();
	double y1 = getD();
	double x2 = getD() - x1;
	double y2 = getD() - y1;
	double x3 = getD();
	double y3 = getD();
	double x4 = getD() - x3;
	double y4 = getD() - y3;
	boolean is = Math.atan2(y2, x2) == Math.atan2(y4, x4);
	System.out.println(is ? "YES" : "NO");
  }
}

private static double getD() {
  return in.nextDouble();
}
}