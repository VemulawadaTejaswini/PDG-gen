import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			int n= sc.nextInt();
			if(n == 0) break;
			int cnt =0;
			for(int i=1;i<n;i++) for(int j=i+1;j<n;j++) {
				if (n == i*(j-i+1) + (j-i+1)*(j-i)/2 ) cnt++; 
			}
			System.out.println(cnt);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}