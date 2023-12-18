import java.util.Scanner;
public class Profit{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int max=a[1]-a[0];
		for(int j=2;j<n;j++){
			for(int i=0;i<j;i++){
				if(max<a[j]-a[i]) max=a[j]-a[i];
			}
		}
		System.out.println(max);
	}
}
