import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int ans=0;
         for(int i=1;i<n;i++) {
        	 int num=n-i;
        	 if(num<1)continue;
        	 if(num==1) {ans++;continue;}
        	 ans+=2;
        	for(int j=2;j<=num/2;j++) {
        		if(num%j==0)ans++;
        	}
         }
     System.out.println(ans);
	}

}
