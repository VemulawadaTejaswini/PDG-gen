import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		int x1 = 0, y1 = 0, time = 0;	
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int sa = t - time;
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2);
			if (dist > sa || sa % 2 != dist % 2) {
				flag = false;
				break;
			}
			x1 = x2;
			y1 = y2;
			time = t;
		}
		System.out.println(flag ? "Yes" : "No");
	}
}