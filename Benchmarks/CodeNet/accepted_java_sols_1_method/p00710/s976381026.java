import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			int r=sc.nextInt();
			if(n==0) break;

			int[] card=new int[n];
			for(int i=0;i<n;i++) card[i]=n-i;
			for(int i=0;i<r;i++){
				int p=sc.nextInt()-1;
				int c=sc.nextInt();
				int[] next=new int[n];
				for(int j= p ;j<p+c;j++) 
				    next[j-p]=card[j];
				for(int j= 0 ;j< p ;j++) 
				    next[c+j]=card[j];
				for(int j=p+c;j< n ;j++) 
				    next[ j ]=card[j];
				card=next;
			}
			System.out.println(card[0]);
		}

		return;
	}
}
