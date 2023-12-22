import java.util.*;
public class Main {
	public static void main(String args[] ){
		Scanner sc =new Scanner(System.in);
	long n = sc.nextLong();
	long m =sc.nextLong();
	long min  = 2018;
	
	
	if(m*m<2019) {
		long data =(n*(n+1))%2019;
		min =data;
	}else{
		for(long i=n;i<m;i++) {
			for(long j=i+1;j<=m;j++) {
				long data =(i*j)%2019;
				if(min > data) {
					//System.out.println(i+" "+j);
					min =data;
				}
				if(min==0) break;
				
				
			}
			if(min==0) break;
		}
		}
	
	
	System.out.println(min);
	
	
	}
}
