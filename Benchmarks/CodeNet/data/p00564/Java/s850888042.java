import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int ans1=100000,ans2=1000000;
		for(int i=1;i<=n;i++) {
			if(a*i>=n) {
				ans1=i*b; break;
			}
		}
		for(int i=1;i<=n;i++) {
			if(c*i>=n) {
				ans2=i*d; break;
			}
		}
		System.out.println(Math.min(ans2, ans1));
		}
	}
