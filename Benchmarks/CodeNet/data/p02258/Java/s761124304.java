import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int max=a[1]-a[0];
		for(int j=2;j<n;j++){
		    int min=1000000000;
			for(int i=0;i<j;i++){
	            if(min>a[i]) min=a[i];
			}
			if(max<a[j]-min) max=a[j]-min;
		}
		System.out.println(max);
	}
}
