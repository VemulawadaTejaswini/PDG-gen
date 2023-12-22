import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int out = 0;
		
		int n = scan.nextInt();
		int time = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int c = scan.nextInt();
			int t = scan.nextInt();
			
			if(t > time) {
				continue;
			}
			if(out==0) {
				out = c;
			} else {
				if(c < out) {
					out = c;
				}
			}
		}
		if(out==0) {
			System.out.println("TLE");
		}else {
		System.out.println(out);
		}
	}
}
