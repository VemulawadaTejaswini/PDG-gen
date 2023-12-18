import java.util.*;

public class Main {
	//browse nanikaka code
	Scanner sc = new Scanner(System.in);
	private void doit() {
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int sign = n < 0 ? 1 : 0;
			n = Math.abs(n);
			StringBuilder ans = new StringBuilder();
			for(int i = 0;; i++){
				if(n == 0) break;
				int num = n % 10;
				if((sign + i) % 2 == 0){
					ans.append(num);
				}
				else{
					int num2 = 10 - num;
					ans.append(num2 % 10);
					if(num2 != 10){
						n += 10;
					}
				}
				n = n / 10;
				
			}
			System.out.println(ans.reverse().toString());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}