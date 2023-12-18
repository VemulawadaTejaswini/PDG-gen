import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int times[] = new int[3];
		
		times[0] = sc.nextInt();
		times[1] = sc.nextInt();
		times[2] = sc.nextInt();

		Arrays.sort(times);

		System.out.println(times[1] + times[0]);
		
	}
}
