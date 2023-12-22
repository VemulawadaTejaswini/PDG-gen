import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double s[]=new double[n];
		
		for(int i=0;i<n;i++) {
			s[i]=sc.nextDouble();
		}
		for(int i=0;i<n-1;i++) {
			
			for(int j=n-1;j>i;j--) {
				if(s[j-1]>s[j]) {
					double c=s[j];
					s[j]=s[j-1];
					s[j-1]=c;
				}
					
			}
		}
		for(int i=0;i<n-1;i++) {
			s[i+1]=((s[i]+s[i+1])/2);
		}
		System.out.println(s[n-1]);
			
		
		
	}

}