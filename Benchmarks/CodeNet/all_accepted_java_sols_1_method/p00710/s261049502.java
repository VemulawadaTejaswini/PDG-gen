import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n,r,p,c;
		while(true){
			n = sc.nextInt();
			r = sc.nextInt();
			if(n==0&&r==0)break;
			int[] before = new int[n];
			for(i=0;i<n;i++){
				before[i]=n-i;
			}
			int[] after = new int[n];
			for(i=0;i<r;i++){
				p=sc.nextInt();
				c=sc.nextInt();
				for(j=0;j<c;j++)after[j]=before[p-1+j];
				for(j=c;j<c+p-1;j++)after[j]=before[j-c];
				for(j=c+p-1;j<n;j++)after[j]=before[j];
				for(j=0;j<n;j++)before[j]=after[j];
			}
			System.out.println(after[0]);
		}
	}
}

