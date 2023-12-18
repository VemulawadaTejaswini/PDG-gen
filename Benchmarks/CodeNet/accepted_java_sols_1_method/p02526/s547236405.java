import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//input
		int n=scan.nextInt();
		int[] s=new int[n];
		for(int i=0;i<n;i++){
			s[i]=scan.nextInt();
		}
		int q=scan.nextInt();
		int[] t=new int[q];
		for(int i=0;i<q;i++){
			t[i]=scan.nextInt();
		}
		//sort
		Arrays.sort(s);
		Arrays.sort(t);
		
		//answer
		int ans=0;
		
		//seeing index
		int indexS=0;
		int indexT=0;
		while(indexS<n && indexT<q){
			if(s[indexS]==t[indexT]){
				ans++;
				indexT++;
			}else if(s[indexS]<t[indexT]){
				indexS++;
			}else{
				indexT++;
			}
		}
		System.out.println(ans);
	}
}