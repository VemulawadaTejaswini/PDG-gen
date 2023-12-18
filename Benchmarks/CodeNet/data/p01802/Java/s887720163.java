import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
		    int dist = sc.nextInt();
		    int buget = sc.nextInt();
		    if (dist == 0) {
		        break;
		    }
		    double min = Double.MAX_VALUE;
		    for (int i = 0; i <= dist / 2; i++) {
		        min = Math.min(min, Math.abs(buget - Math.sqrt(Math.pow(i, 2) + Math.pow(dist - i, 2))));
		    }
		    sb.append(min).append("\n");
		}
		System.out.print(sb);
	}
}

