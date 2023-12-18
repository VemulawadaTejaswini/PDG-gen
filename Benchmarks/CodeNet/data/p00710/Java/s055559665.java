import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n=scan.nextInt();
			int r=scan.nextInt();
			int[] list=new int[n];
			if(n==0 && r==0){
				break;
			}
			for(int i=0;i<n;i++){
				list[i]=n-i;
			}
			
			for(int i=0;i<r;i++){
				int p=scan.nextInt();
				int c=scan.nextInt();
				int[] nextList=Arrays.copyOf(list,list.length);
				
				for(int j=0;j<p+c-1;j++){
					list[j]=nextList[(p-1+j)%(p+c-1)];
				}
				for(int j=p+c-1;j<n;j++){
					list[j]=nextList[j];
				}
			}
			System.out.println(list[0]);
		}
	}
}