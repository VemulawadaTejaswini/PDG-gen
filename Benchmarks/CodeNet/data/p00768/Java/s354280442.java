
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(p+n==0)break;
			
			int[] a = new int[n];
			int i = 0;
			while(true) {
				if(p>0) {
					p--;
					a[i]++;
				}
				else {
					p = a[i];
					a[i] = 0;
				}
				if(p==0) {
					int flag = 1;
					for(int j=0;j<n;j++)
						if(a[j] != 0 && i != j)
							flag = 0;
					if(flag==1) break;
				}
				i = (i+1)%n;
			}
			System.out.println(i);
		}
		
	}
}
