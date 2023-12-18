import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int []a = new int [100*n+m];
		for(int b=0;b<n;b++){
			for(int c=0;c<m;c++){
				a[100*b+c] = sc.nextInt();
			}
		}
		
		int []b = new int[100*m+l];
		for(int c=0;c<m;c++){
			for(int d=0;d<l;d++)
			b[100*c+d] = sc.nextInt();
		}
		
		long x;
		for(int s=0;s<n;s++){
			for(int t=0;t<l;t++){
				x=0;
				for(int u=0;u<m;u++){
					x=x+a[100*s+u]*b[100*u+t];
				}
				if(t!=l-1){
					System.out.print(x+" ");
				}else{
					System.out.println(x);
				}
			}
		}

	}

}