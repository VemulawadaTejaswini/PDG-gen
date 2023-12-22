import java.util.*;
 
class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
 
		int time[] = new int[3];
		time[0] = p + q;
		time[1] = r + q;
		time[2] = p + r;
 
		Arrays.sort(time);

		System.out.println(time[0]);
	}
}