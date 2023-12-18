import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int n = sc.nextInt();
		int ans = 0;
		double xa, ya, ra, xb, yb, rb, l;
		
		for(int i=0; i < n ; i++){
			xa = sc.nextDouble();
			ya = sc.nextDouble();
			ra = sc.nextDouble();
			xb = sc.nextDouble();
			yb = sc.nextDouble();
			rb = sc.nextDouble();
			
			l = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
			
			if(ra + rb < l){
				ans = 0;
			}
			else if(Math.abs(ra - rb) <= l && l <= ra + rb){
				ans = 1;
			}
			else if(Math.abs(ra - rb) > l){
				ans = 2;
			}
			else if(Math.abs(rb - ra) > l){
				ans = -2;
			}
			
			System.out.println(ans);
		}
	}

}