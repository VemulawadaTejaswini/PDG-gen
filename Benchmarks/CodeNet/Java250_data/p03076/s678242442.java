import java.util.Scanner;

public class Main {
	static int []a  = new int[5];
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)a[i] = Integer.parseInt(sc.next());
		sc.close();

		int fanc = 10;
		int sum = 0;
		for(int i=0;i<5;i++) {
			if(fanc>a[i]%10&&a[i]%10>0)fanc=a[i]%10;
			if(a[i]%10==0) {
				sum += a[i];
			}else {
				a[i]/=10;
				sum+=a[i]*10+10;
			}
		}
		sum -= 10-fanc;
		System.out.println(sum);
	}

}
