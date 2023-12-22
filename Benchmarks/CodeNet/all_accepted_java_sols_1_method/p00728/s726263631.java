import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int sum=0,ave,max=0,min=0;
			int[] p=new int[n];
			for(int i=0;i<n;i++){
				p[i]=sc.nextInt();
				if(p[max]<p[i]) max=i;
				if(p[min]>p[i]) min=i;
			}
			for(int i=0;i<n;i++){
				if(i!=max && i!=min) sum+=p[i];
			}
			ave=sum/(n-2);
			System.out.println(ave);
		}
	}
}