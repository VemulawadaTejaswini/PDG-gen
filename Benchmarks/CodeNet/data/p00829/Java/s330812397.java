import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int s = sc.nextInt();

		for (int d = 0; d < s; d++) {

			int e[] = new int[8];
			for (int i = 0; i < 8; i++) {
				e[i] =(int) sc.nextLong(16);
			}

			int z =(int) sc.nextLong(16);

			int cob[] = new int[32];
			int f = 1;
			int sum = 0;

			for (int i = 0; i < 32; i++) {
				cob[i] = -f * 4;
				for (int j = 0; j < 8; j++) {
					if ((e[j] & f) != 0) {
						cob[i] += f;
					}
				}
				cob[i] = cob[i] * 2;
				if ((z & f) != 0) {
					cob[i] -= f;
				} else {
					cob[i] += f;
				}
				f = f << 1;
			}
			for (int j = 0; j < 8; j++) {
				sum += e[j];
			}
			int diff = sum - z;
//			System.out.println(diff);
//			System.out.println(Arrays.toString(cob));
			f = 1;
			int ans = 0;
			for(int i = 0; i < 32; i++){
				if((diff & f) != 0){
					ans+=f;
					diff -= cob[i];
				}
				f = f<<1;
			}
			
			System.out.println(Integer.toHexString(ans) );
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}