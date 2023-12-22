import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int left=0;
		int right=n;
		
		for(int i = 0;i<m;i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			if(l>left) {
				left=l;
			}
			
			if(right>r) {
				right = r;
			}
		}
		
		if(left>right) {
			System.out.println(0);
		}else {
			System.out.println(Math.abs(right-left)+1);
		}
	}
		
}