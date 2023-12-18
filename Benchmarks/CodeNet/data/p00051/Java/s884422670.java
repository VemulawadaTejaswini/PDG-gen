import java.util.Arrays;
import java.util.Scanner;
public class Main{
	private static Scanner sc=new Scanner(System.in);
	
	void ans(){
		int n=sc.nextInt();
		int a[]=new int[8];
		for(int i=0;i<n;i++){
			String  pp=sc.next();
			char ps[]=pp.toCharArray();
			
			for(int j=0;j<8;j++){
				a[j]=ps[j];
			}
			
			
			
			Arrays.sort(a);
			int count=1;
			int temp=0;
			int ans=0;
			for(int j=0;j<8;j++){
				 temp+=a[j]*count;
				count*=10;
				//System.err.println(temp);
			}
			
			
			
			count=1;
			for(int j=7;j>=0;j--){
				ans+=a[j]*count;
				count*=10;
				//System.err.println(ans);
			}
			
			
			
			temp-=ans;
			System.out.println(temp);
		}
	    
	}
	public static void main(String[] args) {
	
		Main app=new Main();
		app.ans();
	}

}