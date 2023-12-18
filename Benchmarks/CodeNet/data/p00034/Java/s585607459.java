import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	in.useDelimiter("(\\p{javaWhitespace}|,)+");
	int[] span = new int[10];
	int allSpan, sA, sB;
	while (in.hasNext()) {
	 allSpan = 0;
	 for (int i = 0; i < 10; i++) {
		span[i] = in.nextInt();
		allSpan += span[i];
	 }
	 sA = in.nextInt();
	 sB = in.nextInt();
	 double l = (sA * (double) allSpan) / (sA + sB);
	 int posi = 1;
	 for (int i = 0; i < 10; i++) {
		if (l > 0) {
		 l -= span[i];
		 posi = i + 1;
		}
	 }
	 System.out.println(posi);
	}
 }
}