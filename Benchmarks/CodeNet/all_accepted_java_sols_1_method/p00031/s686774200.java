import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	while (in.hasNext()) {
	 int w = in.nextInt();
	 int i = 1;
	 sb.setLength(0);
	 while (i <= 512) {
		if ((w & i) == i) {
		 sb.append(i).append(' ');
		}
		i = i << 1;
	 }
	 System.out.println(sb.toString().trim());
	}
 }
}