import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			long[] a = new long[3];
			long[] m = new long[3];
			for(int i=0;i<3;i++){
				a[i] = sc.nextLong();
				m[i] = sc.nextLong();
			}
			if(a[0]==0 && a[1]==0 && a[2]==0 && m[0]==0 && m[1]==0 && m[2]==0)break;

			long x = 1;
			long y = 1;
			long z = 1;
			long countx = 0;
			long county = 0;
			long countz = 0;
			
			while(true){
				x = (a[0]*x)%m[0];
				countx++;
				if(x==1)break;
			}
			while(true){
				y = (a[1]*y)%m[1];
				county++;
				if(y==1)break;
			}
			while(true){
				z = (a[2]*z)%m[2];
				countz++;
				if(z==1)break;
			}

			long l = 0;
			long k = countx;
			long n = county;
			long b = 0;
			
			if(n>k){
				l=k;
				k=n;
				n=l;
			}
		
			while(n!=0){
				l = n;
				n = k%n;
				k = l;
			}
			
			b = countx*county/k;
			
			k = b;
			n = countz;
			
			if(n>k){
				l=k;
				k=n;
				n=l;
			}
		
			while(n!=0){
				l = n;
				n = k%n;
				k = l;
			}
			b = b*countz/k;		
			System.out.println(b);
		}
	}	
}