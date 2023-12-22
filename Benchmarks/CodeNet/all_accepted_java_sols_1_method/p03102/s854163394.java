import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=sc.nextInt();
        int b[]=new int[m];
        int a[]=new int[m];
        for(int i=0;i<m;i++)b[i]=sc.nextInt();
        int ans=0;
        for(int j=0;j<n;j++) {
        	for(int i=0;i<m;i++) {
        		a[i]=sc.nextInt();
        	}
        	int sum=0;
        	for(int i=0;i<m;i++) {
        		sum+=a[i]*b[i];
        	}
        	if(sum+c>0)ans++;
        }
    	   System.out.println(ans);
    }
    }