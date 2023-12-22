
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();

		int d1=c[0]-'0';
		int d2=c[1]-'0';
		int d3=c[2]-'0';
		int d4=c[3]-'0';


		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<2; k++) {
					int sum = d1;
					if(i%2==0) {
						sum+=d2;
					}else {
						sum-=d2;
					}
					if(j%2==0) {
						sum+=d3;
					}else {
						sum-=d3;
					}
					if(k%2==0) {
						sum+=d4;
					}else {
						sum-=d4;
					}
					if(sum==7) {
						System.out.print(d1);
						System.out.print(i%2==0 ? '+' : '-');
						System.out.print(d2);
						System.out.print(j%2==0 ? '+' : '-');
						System.out.print(d3);
						System.out.print(k%2==0 ? '+' : '-');
						System.out.print(d4);
						System.out.println("=7");
						sc.close();
						return;
					}
				}
			}
		}
		sc.close();
	}
}
