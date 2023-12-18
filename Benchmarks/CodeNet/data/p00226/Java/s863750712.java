import java.util.Scanner;
public class Main {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a+b==0) {
				break;
			}
			boolean[] bl = new boolean[10];
			int[] num = new int[4];
			for(int i=0;i<4;i++) {
				num[i] = a%10;
				bl[a%10] = true;
				a/=10;
			}

			int hit = 0;
			int blow = 0;

			for(int i=0;i<4;i++) {
				if(num[i]==b%10) {
					hit++;
				}else if(bl[b%10]) {
					blow++;
				}
				b/=10;
			}
			System.out.println(hit+" "+blow);
			sc.close();
		}
	}
}