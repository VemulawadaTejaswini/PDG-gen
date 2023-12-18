import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		
		long s = H * W;
		long s1h = H * W;
		long s1w = H * W;
		long sh3 = H * W;
		long sw3 = H * W;
		
		if(H * W % 3 == 0) {
			System.out.println(0);
		} else {
			sh3 = (H / 3 + 1) * W - H / 3 * W;
			sw3 = (W / 3 + 1) * H - W / 3 * H;
			
			for(long i = 1; i < H; i++) {
				long s1 = i * W;
				long s2 = (H - i) * (W / 2);
				long s3 = 0;
				
				if(W % 2 == 0) {
					s3 = s2;
				} else {
					s3 = (H - i) * (W / 2 + 1);
				}
				
				long stemp = Math.max(Math.max(s1, s2), s3) - Math.min(Math.min(s1,  s2), s3);
				s1h = Math.min(s1h, stemp);
			}
			
			for(long i = 1; i < W; i++) {
				long s1 = i * H;
				long s2 = (W - i) * (H / 2);
				long s3 = 0;
				
				if(H % 2 == 0) {
					s3 = s2;
				} else {
					s3 = (W - i) * (H / 2 + 1);
				}
				
				long stemp = Math.max(Math.max(s1, s2), s3) - Math.min(Math.min(s1,  s2), s3);
				s1w = Math.min(s1w, stemp);
			}
			
			s = Math.min(Math.min(Math.min(sh3, sw3), s1h), s1w);
			System.out.println(s);
		}
	}
}