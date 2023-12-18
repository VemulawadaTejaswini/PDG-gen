import java.util.Scanner;

public class Main {
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			int n = sc.nextInt();
			
			int t,x,y,dis;
			String ans = "Yes";
			for (int i=0; i<n; i++) {
				t = sc.nextInt();
				x = sc.nextInt();
				y = sc.nextInt();
				dis = x+y;
				if (dis > t) {
					ans = "No";
					break;
				}
				else {
					if ((t-dis)%2 == 1) {
						ans = "No";
						break;
					}
				}
			}
			
			System.out.println(ans);
		}
	}