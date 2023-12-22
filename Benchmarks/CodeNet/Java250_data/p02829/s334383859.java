
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean ans[] = new boolean[3+1];
		int a=sc.nextInt();
		for(int i=1; i<=3; i++) {
			if(a==i) {
				ans[i]=true;
				break;
			}
		}
		int b=sc.nextInt();
		for(int i=1; i<=3; i++) {
			if(b==i) {
				ans[i]=true;
				break;
			}
		}
		int j=-1;
		for(int i=1; i<=3; i++) {
			if(ans[i]==false) {
				j=i;
				break;
			}
		}
		System.out.println(j);
		sc.close();
	}
}
