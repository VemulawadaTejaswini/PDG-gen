import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String[] x = sc.nextLine().split(" ");
		int s,g,d;
		int answer = 0;
		d = Integer.parseInt(x[1]);
		for (int i =0;i < Integer.parseInt(x[0]);i++) {
			String[] y = sc.nextLine().split(" ");
			s = Integer.parseInt(y[0]);
			g = Integer.parseInt(y[1]);
			if (Math.sqrt(Math.pow(s,2) + Math.pow(g,2)) <= d) {
				answer += 1;
			}
		}
		System.out.print(answer);
	}

}