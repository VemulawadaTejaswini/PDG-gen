import java.util.Scanner;

public class Main {
	public static int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
	public static String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			if (m == 0) {
				break;
			}
			int sum = 0;
			for(int i=0;i<m-1;i++) {
				sum += days[i];
			}
			sum += d - 1;
			System.out.println(week[(3+sum)%7]);
		}
	}

}