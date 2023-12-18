import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Double hako[]=new Double [n];
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextDouble();
		}
		int j=1;
		for(int i=0;i<n-1;i++) {
			if(i<n-1) {
				while(hako[i]*10000%1<=0.1) {
					i++;
				}
			}
			for(j=i+1;j<n;j++) {
				if(j<n-1) {
					while(hako[j]*10000%1<=0.1) {
						j++;
					}
				}
				if((hako[i]*hako[j] == Math.floor(hako[i]*hako[j])) && !Double.isInfinite(hako[i]*hako[j]) && ((hako[i]*10*hako[j]*10) % 1) == 0) {
					ans++;
					}
			}
		}
		System.out.println(ans);
	}
}
