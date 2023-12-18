import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			int p = sc.nextInt();
			int q = sc.nextInt();
			int maxrange = Math.max(p, Math.max(-p, Math.max(q, -q)));
			int minrange = Math.min(p, Math.min(-p, Math.min(q, -q)));
			int count = 0;
			for(int m = minrange; m <= maxrange; m++){
				for(int n = minrange; n <= maxrange; n++){
					if(m == 0 && n == 0) continue;
					int a = m * p + n * q;
					int b = m * q - n * p;
					int mn = m * m + n * n;
					
					if(a % mn == 0 && b % mn == 0){
						count++;
					}
				}
			}
			System.out.println(count == 8 ? "P" : "C");
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}