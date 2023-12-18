import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int na=77;
		double ze=11;
		for(int ans=2;ans<=7;ans++) {
			
			if(k==1 || k==7) {
				System.out.println(1);
				break;
			}
			
			if(k==na) {
				System.out.println(ans);
				break;
			}
			else if(k==ze) {
				System.out.println(ans+1);
				break;
			}
			else {
				int hako=1;
				na=na*10+7;
				for(int i=0;i<ans-1;i++) {
					hako*=10;
				}
				ze=ze+9*hako;
				System.out.println(ze);
			}
			
			if(ans==7) {
				System.out.println(-1);
				break;
			}
			
		}
		
	}
}
