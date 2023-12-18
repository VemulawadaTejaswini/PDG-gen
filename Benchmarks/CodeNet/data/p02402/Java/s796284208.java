import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] N=new int[n];
		int h,max=-1000000,min=1000000,sum=0;
		for(int i=0;i<n;i++){
			h=sc.nextInt();
			N[i]=h;
			sum+=N[i];
			if(N[i]<min)
				min=N[i];
			if(N[i]>max)
				max=N[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}
