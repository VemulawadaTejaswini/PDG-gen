import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static int map[][];
	public static int t=0,s=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int data[][]=new int[n][n];
			int num[]=new int[n];
			for(int i=0;i<n;i++){//人数
				num[i]=sc.nextInt();
				for(int j=0;j<num[i];j++){
					data[i][j]=sc.nextInt();
				}
			}
			int know=sc.nextInt();
			int k[]=new int[know];
			for(int i=0;i<know;i++){
				k[i]=sc.nextInt();
			}
			int cnt=0,ans=0,x=0;
			for(int i=0;i<n;i++){
				cnt=0;
				for(int j=0;j<num[i];j++){
					for(int l=0;l<know;l++){
						if(data[i][j]==k[l]){
							cnt++;
						}
					}
				}
				if(cnt==know){
					ans=i+1;x++;
				}else if(ans==0)ans=-1;
			}
			if(x>1)ans=-1;
			System.out.println(ans);
		}
	}
}