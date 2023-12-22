import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		//int count = sc.nextInt();
		int num = sc.nextInt();
		int nums[] = new int[num];
		int t[] = new int[num];
		int x[] = new int[num];
		int y[] = new int[num];
		for(int i = 0; i < num; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for(int i = 0; i < num; i++) {
			int sum = 0;
			int time = t[i] - (i==0?0:t[i-1]);
			if(i == 0) {
				sum = x[i] + y[i];
			}
			else {
				sum = x[i] - x[i - 1] + y[i] - y[i-1];
			}
			if(sum > time) {
				System.out.println("No");
				return;
			}
			else if(sum < time) {
				if((time - sum) % 2 != 0) { System.out.println("No"); return;}
			}
		}
		System.out.println("Yes");
	}
}