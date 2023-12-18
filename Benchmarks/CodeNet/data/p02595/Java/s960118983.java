import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String[] x = sc.nextLine().split(" ");
		int answer = 0;
		int d = Integer.parseInt(x[1]);
		for (int i =0;i < Integer.parseInt(x[0]);i++) {
			String[] y = sc.nextLine().split(" ");
			int s = Integer.parseInt(y[0]);
			int g = Integer.parseInt(y[0]);
			if (Math.sqrt(Math.pow(s,2) + Math.pow(g,2)) <= d) {
				answer += 1;
			}
		}
		System.out.print(answer);
	}

}