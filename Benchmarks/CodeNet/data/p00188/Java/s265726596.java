import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int x = sc.nextInt();
			int s = 0;
			int g = n-1;
			int cnt = 0;
			while(s<=g){
				cnt++;
				int m = (s+g)/2;
				if(g<=s)break;
				if(a[m]<x)s=m+1;
				else if(a[m]>x)g=m-1;
				else break;
			}
			System.out.println(cnt);
		}
	}
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}