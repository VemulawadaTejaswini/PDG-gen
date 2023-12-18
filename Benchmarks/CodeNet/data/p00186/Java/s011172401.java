import java.util.Scanner;

public class Main {
	static int cc1 = 0;
	static int cc2 = 0;

	public static void main(String[] args) {
		doIt();
	}
	static void doIt(){
		Scanner sc = new Scanner(System.in);
		int q1 = sc.nextInt();
		while(0 < q1){
			int b = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int q2 = sc.nextInt();
			int max = q2, min = 0, mid = 0;
			while(min < max){
				mid = (max + min) / 2;
				if(check(mid, q1, b, c1, c2)){
					if(min == mid) {
						if(check(mid + 1, q1, b, c1, c2)) max = mid + 1;
						else max = mid;
						break;
					}
					else min = mid;
				}
				else max = mid - 1;
				//System.out.println("min = " + min + ", max = " + max + ",m = " + mid);
			}
			if(max < 1) System.out.println("NA");
			else  System.out.println(cc1 + " " + cc2);
			q1 = sc.nextInt();
		}
	}

	static boolean check(int m, int q1, int b, int c1, int c2){
		boolean ret = false;
		int money = b - c1*m;
		if(money < 0) return false;
		int nml = money / c2;
		if(q1 <= m + nml){
			ret = true;
			cc1 = m;
			cc2 = nml;
		}	
		return ret;
	}

}