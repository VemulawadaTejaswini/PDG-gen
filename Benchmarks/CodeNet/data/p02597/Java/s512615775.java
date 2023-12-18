import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char[] c=new char[n];
		
		int nr=0;
		int ans=0;
		
		for(int i=0;i<n;i++) {
			c[i]=s.charAt(i);
			if(c[i]=='R')nr++;
		}
		
		for(int i=0;i<n;i++) {
			if(nr==0)break;
			if(c[i]=='W') {
				nr--;
				ans++;
			}else {
				nr--;
			}
		}
		
	 System.out.println(ans);
		
	}

}
