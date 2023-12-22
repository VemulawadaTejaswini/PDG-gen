import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a=sc.nextInt();
			int d=sc.nextInt();
			int n=sc.nextInt();
			if((a==0&&d==0)&&n==0) break;
			int[] sosu = new int[500000];
			int[] tansaku = new int[1000001];
			for(int i=0;i<=1000000;++i){
				if((i!=0&&i!=1)&&i%2!=0){
					tansaku[i]=1;
				}
			}
			int end=(int)Math.sqrt((double)1000000);
			sosu[0]=2;
			for(int i=3;i<=end;i+=2){
				if(tansaku[i]==1){
					for(int j=i+i;j<=1000000;j+=i){
						if(tansaku[j]==1) tansaku[j]=0;
					}
				}
			}
			int m=1;
			for(int i=3;i<=1000000;++i){
				if(tansaku[i]==1){
					sosu[m]=i;
					++m;
				}
			}
			int count=0;
			Arrays.sort(sosu);
			while(true){
				if(a>1000000) break;
				if(Arrays.binarySearch(sosu,a)>=0){
					count++;
				}
				if(count==n){
					System.out.println(a);
					break;
				}
				a+=d;
			}
		}
	}
}

