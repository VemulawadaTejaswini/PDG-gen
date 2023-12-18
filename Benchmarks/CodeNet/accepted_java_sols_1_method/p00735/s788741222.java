import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[85715];
		int[] sosu = new int[35813];
		int[] tansaku = new int[300001];
		for(int i=6;i<=300000;++i){
			if(i%7==6 || i%7==1){
				tansaku[i]=1;
			}
		}
		int end=(int)Math.sqrt((double)300000);
		for(int i=6;i<=end;i++){
			if(tansaku[i]==1){
				for(int j=i+i;j<=300000;j+=i){  // 素数の定数倍は素数とならないので排除するループ
					if(tansaku[j]==1){
						tansaku[j]=0;
					}
				}
			}
		}
		int m=0;
		for(int i=6;i<=300000;++i){
			if(tansaku[i]==1){
				sosu[m]=i;
				++m;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==1) break;
			System.out.print(n+":");
			for(int i=0;i<sosu.length;++i){
				if(n%sosu[i]==0) System.out.print(" "+sosu[i]);
			}
			System.out.println();
		}
	}
}

