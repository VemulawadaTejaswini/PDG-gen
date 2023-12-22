import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		loop:for(int i=0;;i++){
			for(int k=0;k<n;k++){
				if(a[k]%2!=0){
					break loop;
				}
			}
			for(int s=0;s<n;s++){
				a[s]/=2;
			}
			count++;
		}

		System.out.println(count);




	}
}
