import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,r,c,p;
		int[] card,card2;
		card=new int[51];
		card2=new int[51];
		while(1>0){
			n=sc.nextInt();
			r=sc.nextInt();
			if(n+r==0)break;
			for(int i=1;i<=n;i++)card[i]=n-i+1;
			for(int i=0;i<r;i++){
				p=sc.nextInt();
				c=sc.nextInt();
				for(int j=1;j<=c;j++)card2[j]=card[j+p-1];
				for(int j=c+1;j<=p+c-1;j++)card2[j]=card[j-c];
				for(int j=1;j<=p+c-1;j++)card[j]=card2[j];
			}
			System.out.println(card[1]);
		}
	}
}