import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=1,x=1,cnt=0;
		while(n!=0 || x!=0){
			n=sc.nextInt();
			x=sc.nextInt();
			cnt=0;
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					for(int k=j+1;k<=n;k++)if(i+j+k==x)cnt++;
				}
			}
			if(n!=0)System.out.printf("%d\n",cnt);
		}
	}
}