import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] a = new int[3];
			int[] m = new int[3];
			for(int i=0;i<3;i++){
				a[i] = sc.nextInt();
				m[i] = sc.nextInt();
			}
			if(a[0]==0 && a[1]==0 && a[2]==0 && m[0]==0 && m[1]==0 && m[2]==0)break;

			int x = 1;
			int y = 1;
			int z = 1;
			int countx = 0;
			int county = 0;
			int countz = 0;
			
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

			int l = 0;
			int k = countx;
			int n = county;
			int b = 0;
			
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