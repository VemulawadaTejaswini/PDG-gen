import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		int answer = 0;
		Arrays.sort(x);

		while (x[0] != x[1] || x[1] != x[2]) {
			if (x[1] == x[2]) {
				x[0] += 2;
			} else {
				x[0] += 1;
				x[1] += 1;
			}
			answer++;
			Arrays.sort(x);
		}

		System.out.println(answer);
  }
}
