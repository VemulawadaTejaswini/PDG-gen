import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			for(int i=0;i<n;i++){
				int[] a = new int[4];
				int[] b = new int[4];
				int[] c = new int[4];
				for(int j=0;j<4;j++) a[j] = sc.nextInt();
				for(int j=0;j<4;j++) b[j] = sc.nextInt();
				c[0] = a[0]*b[0] - a[1]*b[1] - a[2]*b[2] - a[3]*b[3];
				c[1] = a[0]*b[1] + a[1]*b[0] + a[2]*b[3] - a[3]*b[2];
				c[2] = a[0]*b[2] + a[2]*b[0] + a[3]*b[1] - a[1]*b[3];
				c[3] = a[0]*b[3] + a[3]*b[0] + a[1]*b[2] - a[2]*b[1];
				System.out.println(c[0] + " " + c[1] + " " + c[2] + " " + c[3]);
			}
		}
	}	
}