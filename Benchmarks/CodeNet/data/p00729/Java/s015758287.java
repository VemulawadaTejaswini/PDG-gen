import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static final int T=540;
	static int student[][];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,M,r,i,j;
		int t,n,m,s;
		int t1,t2,q;
		int count[];

		while(true){
			N=sc.nextInt();
			M=sc.nextInt();
			if(N==0 && M==0) break;
			
			r=sc.nextInt();
			student=new int[M+1][720];
			count=new int[M+1];
			Arrays.fill(count, 0);
			for(i=1;i<=M;i++){
				for(j=0;j<720;j++){
					student[i][j]=0;
				}
			}
			for(i=0;i<r;i++){
				t=sc.nextInt();
				n=sc.nextInt();
				m=sc.nextInt();
				s=sc.nextInt();
				if(s==1){
					if(count[m]==0){
					student[m][t-T]=1;
					count[m]++;
					}
					else{
						count[m]++;
					}
				}
				if(s==0){
					if(count[m]==1){
						drow(m,t-1);
						count[m]--;
					}
					else{
						count[m]--;
					}
				}//
			}
			q=sc.nextInt();
			for(i=0;i<q;i++){
				t1=sc.nextInt();
				t2=sc.nextInt();
				m=sc.nextInt();
				System.out.println(sum(m,t1,t2));
			}
		}
	}
	static void drow(int m,int f){
		int i;
		for(i=f;0<=i;i--){
			if(student[m][i-T]==1) break;
			else student[m][i-T]=1;
		}
	}
	static int sum(int m,int t1,int t2){
		int i,sum=0;
		for(i=t1;i<t2;i++){
			sum+=student[m][i-T];
		}
		return sum;
	}
}