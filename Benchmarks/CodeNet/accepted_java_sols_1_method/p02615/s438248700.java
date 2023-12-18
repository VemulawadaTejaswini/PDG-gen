import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		long sum =0;
		for(int i=0;i<n;i++) {
			a[i] = scan.nextLong();
			sum+=a[i];
		}
		
		if(n==1){
           System.out.println(0);
           }else {
        	   Arrays.sort(a);
        	long[] r = new long[n];
        	 for(int i=0;i<a.length;i++)
        		 r[i]=a[n-i-1];
           long ans=r[0],ct=1;
           for(int i=1;i<n;i++){
            if(ct>=(n-1)) break;
            ans+=r[i]; ct++;
            if(ct>=(n-1)) break;
            ans+=r[i]; ct++;
           }
           System.out.println(ans);
           }
		
	}

}
