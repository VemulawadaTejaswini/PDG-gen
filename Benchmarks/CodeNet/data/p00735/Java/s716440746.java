import java.util.*;
public class Main {
	Scanner sc;
	Vector<Integer> gdlist;
	boolean[] primegd;
	final int max = 3000001;
	
	
	void createGD() {
		primegd = new boolean[max];
		for(int i=0;i<max;i++) {
			primegd[i] = true;
		}
		for(int i=1;;i++) {
			if(i*7-1>max) break;
			if(primegd[i*7-1]) {
				for(int j=2*(i*7-1);j<max;j+=i*7-1) primegd[j] = false;
			}
			if(primegd[i*7+1]) {
				for(int j=2*(i*7+1);j<max;j+=i*7+1) primegd[j] = false;
			}
			for(int j=2;j<6;j++) {
				primegd[i*7-j] = false;
			}
		}
		
	}
	
	
	void run() {
		sc = new Scanner(System.in);
		createGD();
		while (true) {
			int n = sc.nextInt();
			if(n == 1) break;
			System.out.print(n + ": ");
			for(int i=6;i<max;i++) {
				if(!primegd[i]) continue;
				if(n == 1) break;
				if(n % i != 0) continue;
				else {
					System.out.print(i);
//					while(n%it==0) n /= it;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}