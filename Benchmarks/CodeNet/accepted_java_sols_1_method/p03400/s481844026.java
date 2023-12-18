import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	 	int n = sc.nextInt();
		double d = sc.nextInt();
		int x = sc.nextInt();
		int answer = x;

		for (int i = 0; i < n; i++) {
			double ai = sc.nextInt();
			answer += Math.ceil(d / ai);
		}

		System.out.println(answer);
  }
}
