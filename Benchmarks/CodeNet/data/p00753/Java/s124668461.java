import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int[] sosu = new int[2*n+1];
			int[] tansaku = new int[2*n+1];
			for(int i=0;i<=2*n;++i){
				if((i!=0&&i!=1)&&i%2!=0){
					tansaku[i]=1;
				}
			}
			int end=(int)Math.sqrt((double)2*n);
			sosu[0]=2;
			for(int i=3;i<=end;i+=2){
				if(tansaku[i]==1){
					for(int j=i+i;j<=2*n;j+=i){
						if(tansaku[j]==1) tansaku[j]=0;
					}
				}
			}
			int m=1;
			for(int i=3;i<=2*n;++i){
				if(tansaku[i]==1){
					sosu[m]=i;
					++m;
				}
			}
			int l=0,count=0;
			for(int i=0;i<m;++i){
				if(2*n<sosu[l]) break;
				if(n<sosu[l] && sosu[l]<=2*n) count++;
				l++;
			}
			System.out.println(count);
		}
	}
}
