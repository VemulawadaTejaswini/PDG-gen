
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
			int n=sc.nextInt();
		double a[]=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		int count=0;
			s:for(int i=0;i<n;i++) {
				if((int)Math.ceil((a[i]))!=(int)Math.floor(a[i])&&a[i]*100000>1000000) {
					continue s;
				}
				for(int j=i+1;j<n;j++) {
				
					if((int)Math.ceil((a[i]*a[j]))==(int)Math.floor(a[i]*a[j])&&((a[i]!=0.999999999&&a[j]!=1.000000001)&&(a[j]!=0.999999999&&a[i]!=1.000000001))) {
						count++;
						
					}
				}
			}
			System.out.println(count);
		
	}

}
