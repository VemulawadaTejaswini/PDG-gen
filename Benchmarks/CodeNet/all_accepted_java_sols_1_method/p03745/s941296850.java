import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=stdIn.nextInt();
		int a[]=new int[n];
		int cnt=0,mode=0;
		for(int i=0;i<n;i++)
			a[i]=stdIn.nextInt();
		for(int i=1;i<n;i++){
			if(mode==0){
				if(a[i-1]<a[i])
					mode=1;
				else if(a[i-1]>a[i])
					mode=2;
			}
			else if(mode==1&&a[i-1]>a[i]){
				cnt++;
				mode=0;
			}
			else if(mode==2&&a[i-1]<a[i]){
				cnt++;
				mode=0;
			}
		}
		System.out.println(cnt+1);
	}
}