import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Double hako[]=new Double [n];
		double list=0;
		int size=0;
		
		for(int i=0;i<n;i++) {
			list=sc.nextDouble();
			if((list*10000)%1<1 && (list*10000)%1>0.00001) {
			}
			else {
				hako[size]=list;
				size++;
			}
		}
		
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if((hako[i]*hako[j] == Math.floor(hako[i]*hako[j])) && !Double.isInfinite(hako[i]*hako[j]) && ((hako[i]*10*hako[j]*10) % 1) == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
