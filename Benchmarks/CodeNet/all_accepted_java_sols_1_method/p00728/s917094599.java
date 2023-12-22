import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,n,a,ave,max=0,min=1000,sum=0;
		while(true){
			n = sc.nextInt();
			if(n==0)break;
			for(i=0;i<n;i++){
				a=sc.nextInt();
				if(max<a)max=a;
				if(min>a)min=a;
				sum+=a;
			}
			sum-=max+min;
			ave = sum/(n-2);
			System.out.println(ave);
			max=0;
			min=1000;
			sum=0;
		}
	}
}

