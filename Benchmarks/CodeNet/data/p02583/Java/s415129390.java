
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			if(n<=2) {
				System.out.println(0);
			}else {
				int count=0;
				for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					for(int k=j+1;k<n;k++) {
						if(a[i]!=a[j]&&a[j]!=a[k]&&a[i]!=a[k]&&a[i]+a[j]>a[k]&&a[j]+a[k]>a[i]&&a[k]+a[i]>a[j]) {
						
					
							count++;
						}
					}
				}
			}
				
			System.out.println(count);
				
			
			}
		}
}




