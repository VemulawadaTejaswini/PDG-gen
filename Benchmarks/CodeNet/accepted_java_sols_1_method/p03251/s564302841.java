import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int xx = sc.nextInt();
		int yy = sc.nextInt();
	
		if(xx>=yy) {
			System.out.println("War");
			sc.close();
			return;
		}
		
		int max_x=-100;
		int min_y=100;
		
		for(int i=0;i<n;i++) {
			max_x = Math.max(max_x, sc.nextInt());
		}
		for(int i=0;i<m;i++) {
			min_y = Math.min(min_y, sc.nextInt());
		}
		
		if(max_x>= min_y) {
			System.out.println("War");
			sc.close();
			return;
		}
		
		for(int z=yy;z>xx;z--) {
			if(z <= min_y && z > max_x) {
				System.out.println("No War");
				sc.close();
				return;
			}
		}

		System.out.println("War");
		
		sc.close();
	}

}				