import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		while((n=scan.nextInt())!=0){
			int max=0;
			int min=1000;
			int ans=0;
			int[] s=new int[n];
			for(int i=0;i<n;i++){
				s[i]=scan.nextInt();
				ans+=s[i];
				if(s[i]<min){
					min=s[i];
				}
				if(s[i]>max){
					max=s[i];
				}
			}
			ans-=(max+min);
			System.out.println(ans/(n-2));
		}
	}
}