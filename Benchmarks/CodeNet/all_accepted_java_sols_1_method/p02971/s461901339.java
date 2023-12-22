import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int[n];

		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		int max=0;
		int num=0;
		int nextMax=0;

		for(int i=0;i<n;i++){
			if(a[i]>max){
				max=a[i];
				num=i;
			}
		}

		for(int i=0;i<n;i++){
			if(a[i]>nextMax && i!=num){
				nextMax=a[i];
			}
		}

		for(int i=0;i<n;i++){
			if(i==num){
				System.out.println(nextMax);
			}else{
				System.out.println(max);
			}
		}


	}



}
