import java.util.*;
import java.util.Scanner;

public class Main{
	static Scanner sc=new Scanner(System.in);
	static int x=sc.nextInt();
	static int[] a=new int[x+1];
	
	public static void main(String[] args) {
	    a[1]=1;
	    for(int i=2;i<=x;i++) {
	    	a[i]=1;
	    }
	    int ans=0;
	    if(x>=1)ans=1;
	    if(x>=2)ans=5;
		//int t=x;
		if(x<=2) {
			System.out.println(ans);
			System.exit(0);
		}
		for(int i=3;i<=x;i++)   {
		    int check=1;
			for(int j=i/2+1;j>=1;j--) {
				if(i%j==0){
					check++;
				}
			}
		//	System.out.println(i+" "+check);
			//a[i]=check;
			ans+=i*check;
		}
	    
	    
	    System.out.println(ans);
	}
}
