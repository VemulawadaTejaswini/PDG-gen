import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		while(true){
		int n=scan.nextInt();
		if(n==0)break;
		int []a=new int[101];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int r=0,l=n-1,cnt=0;
		while(r<=l){
			++cnt;
			int h =(r+l)/2;
			if(a[h]==m)break;
			if(a[h]>m){
				r=h+1;
			}
			else{
				l=h;
			}
		}
		System.out.println(cnt);
	}
	}
}