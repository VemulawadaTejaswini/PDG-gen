import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]d = new int[6];
		for(int i = 0; i < 6; i++) {
			d[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if((a==d[1]&&b==d[2])||(a==d[3]&&b==d[1])||(a==d[4]&&b==d[3])||(a==d[2]&&b==d[4])) {
				System.out.println(d[0]);
			}else if((a==d[0]&&b==d[3])||(a==d[2]&&b==d[0])||(a==d[5]&&b==d[2])||(a==d[3]&&b==d[5])) {
				System.out.println(d[1]);
			}else if((a==d[0]&&b==d[1])||(a==d[4]&&b==d[0])||(a==d[5]&&b==d[4])||(a==d[1]&&b==d[5])) {
				System.out.println(d[2]);
			}else if((a==d[0]&&b==d[4])||(a==d[1]&&b==d[0])||(a==d[5]&&b==d[1])||(a==d[4]&&b==d[5])) {
				System.out.println(d[3]);
			}else if((a==d[0]&&b==d[2])||(a==d[3]&&b==d[0])||(a==d[5]&&b==d[3])||(a==d[2]&&b==d[5])) {
				System.out.println(d[4]);
			}else {
				System.out.println(d[5]);
			}
		}
		scan.close();
	}
}
