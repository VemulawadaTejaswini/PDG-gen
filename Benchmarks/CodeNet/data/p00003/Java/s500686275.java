import java.util.Scanner;
import java.util.Arrays;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int cnt = scan.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			Integer[] tri = new Integer[3];
			
			tri[0] = scan.nextInt();
			tri[1] = scan.nextInt();
			tri[2] = scan.nextInt();
			
			Arrays.sort(tri);
			
			tri[0] *= tri[0];
			tri[1] *= tri[1];
			tri[2] *= tri[2];
			
			if((tri[0] + tri[1]) == tri[2]) {
				System.out.println("YES");
			}
			
			else {
				System.out.println("NO");
			}
		}
	}
	
}