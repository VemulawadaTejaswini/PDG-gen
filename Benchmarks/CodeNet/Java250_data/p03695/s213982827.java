
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r[] = new int[9];
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			if(v<400) {
				r[0]++;
			}else if(v<800) {
				r[1]++;
			}else if(v<1200) {
				r[2]++;
			}else if(v<1600) {
				r[3]++;
			}else if(v<2000) {
				r[4]++;
			}else if(v<2400) {
				r[5]++;
			}else if(v<2800) {
				r[6]++;
			}else if(v<3200) {
				r[7]++;
			}else {
				r[8]++;
			}
		}
		int min = 0;
		int max = 0;
		int s = 0;
		for(int i=0; i<8; i++) {
			if(r[i]>0) {
				min++;
			}else {
				s++;
			}
		}
		if(min==0) {
			min = 1;
			max = r[8];
		}else {
			max = min + r[8];
		}

		System.out.println(min+" "+max);
		sc.close();
	}
}
