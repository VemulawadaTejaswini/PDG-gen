
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			double alpha=0;
			if(n==0){
				break;
			}
			int students[] = new int[n];
			double ave=0;

			for (int i = 0; i < n; i++) {
				students[i]=sc.nextInt();
				ave+=students[i];
			}
			ave/=n;
			for(int j=0;j<n;j++){
				alpha+=(students[j]-ave)*(students[j]-ave);
			}
			System.out.println(Math.sqrt(alpha/n));

		}
	}
}