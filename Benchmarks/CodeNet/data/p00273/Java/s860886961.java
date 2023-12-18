import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj278().doIt();
	}
	class aoj278{
		void doIt() {
			int n = sc.nextInt();
			for(int i = 0;i < n;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int b = sc.nextInt();
				int p = sc.nextInt();
				int ans = 0;
				if(b >=5 && p >= 2)ans = (int)((x*b + y*p)*0.8);
				else {
					ans = x*b + y*p;
					int ans2 = x*b + y*p;
					if(b < 5)ans2 = ans2 + x*(5 - b);
					if(p < 2)ans2 = ans2 + y*(2 - p);
					ans2 = (int)(ans2*0.8);
					if(ans > ans2)ans = ans2; 
				}
				System.out.println(ans);
			}
		}
	}
}