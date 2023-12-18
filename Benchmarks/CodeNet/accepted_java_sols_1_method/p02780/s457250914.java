	import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	
			int k = sc.nextInt();
			
		    double p[] = new double[n];
			double ep[] = new double[n];
			double sumep[] = new double[n];
			List<Double>  ksumep = new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				p[i] = sc.nextDouble();
			}
			
			for(int i=0;i<n;i++) {
				ep[i] = (1.0+p[i])/2.0;
			}
			
			for(int i=0;i<n;i++) {
				if(i==0) {
					sumep[i]=ep[i];
				}else {
					sumep[i]=sumep[i-1] + ep[i];
				}
			}
			
			for(int i=0;i<=n-k;i++) {
				if(i==0) {
					ksumep.add(sumep[k-1]) ;
				}else {
					ksumep.add(sumep[i+k-1]-sumep[i-1]) ;
				}
			}
			
			Collections.sort(ksumep,Collections.reverseOrder());
			
			System.out.println(ksumep.get(0));
		}
				
	}