
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] ACs =new int[n+1];
		int[] WAs =new int[n+1];
		for (int i=0;i<n+1;i++) {
			ACs[i]=0;
			WAs[i]=0;
		}
		for (int i=1;i<=m;i++) {
			int p=sc.nextInt();
			String s=sc.next();
			if (s.equals("AC")&&ACs[p]==0) {
				ACs[p] ++;
			} else if (s.equals("WA")&&ACs[p]==0){
				WAs[p] ++;
			}
		}
		int sumAC =0;
		int sumWA =0;
		for (int i=1;i<=n;i++) {
			sumAC += ACs[i];
			if (ACs[i]==1){
				sumWA += WAs[i];
			}

		}
		System.out.println(sumAC);
		System.out.println(sumWA);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//メソッド置き場

	//----------------------------------------
}