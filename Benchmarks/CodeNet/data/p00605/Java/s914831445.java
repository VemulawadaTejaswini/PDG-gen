import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,k;
		int s[],b[][],sum[];
		boolean flag;
		
		while(true){
			flag=true;
			n=sc.nextInt();
			k=sc.nextInt();
			if(n+k==0) break;
			s=new int[k];
			sum=new int[k];
			b=new int[n][k];
			for(i=0;i<k;i++){
				s[i]=sc.nextInt();
				sum[i]=0;
			}
			for(i=0;i<n;i++){
				for(j=0;j<k;j++){
					b[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<k;i++){
				for(j=0;j<n;j++){
					sum[i]+=b[j][i];
				}
			}
			for(i=0;i<k;i++){
				//System.out.println(s[i]+" "+sum[i]);
				if(s[i]<sum[i]){
					flag=false;
				}
			}
			if(flag) System.out.println("Yes");
			else System.out.println("No");
		}
	}

}