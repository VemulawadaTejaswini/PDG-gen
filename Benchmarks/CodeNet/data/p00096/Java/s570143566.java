import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tem1=0;
		int tem2=0;
		int sum=0;
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i=0; i<=n || i<=2000 ;i++) {
				for(int j=0;j<=1000;j++) {
					for(int k=0;k<=1000;k++) {
						if(j+k==i) tem1+=1;
					}
				}
				for(int l=0;l<=1000;l++) {
					for(int m=0;m<=1000;m++) {
						if(l+m==n-i) tem2+=1;
					}
				}
				sum+=tem1*tem2;
			}
			System.out.printf("%d\n",sum);
			
			tem1=0;
			tem2=0;
			sum=0;
		}
	}
}

