import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int q1 = sc.nextInt();
			if (q1==0) {
				break;
			}
			int b = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int q2 = sc.nextInt();
			int aizuJMax = min(q2,b/c1);
			if (aizuJMax<1) {
				System.out.println("NA");
				continue;
			}
			int ans1 = 0,ans2 = 0;
			for (int aj = 1;aj <= aizuJMax;aj++) {
				int tori = (b - (aj * c1))/c2;
				if (tori+aj>=q1) {
					ans1 = aj;
					ans2 = tori;
				}else{
					break;
				}
			}
			if (ans1+ans2>0) {
				System.out.println(ans1+" "+ans2);
			}else{
				System.out.println("NA");
			}
		}
	}
	public static int min(int a,int b) {
		return a<b ? a : b;
	}
}