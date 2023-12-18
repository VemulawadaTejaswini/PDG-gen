import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();//にんじんの個数
			int K=sc.nextInt();//保持できるにんじんの数
			int k=0;//保持しているにんじんの数
			int T=sc.nextInt();//加速できる時間
			int U=sc.nextInt();//普通の速さ
			int V=sc.nextInt();//加速の速さ
			int boost=0;//加速で進む距離
			int L=sc.nextInt();//スタ－トからゴールまでの距離
			int[] D=new int[N+1];//にんじんが置かれている場所
			for(int i=1; i<=N; i++) {
				D[i]=sc.nextInt();
			}
			int index=1;
			double ans=0;
			for(int i=0; i<L; i++) {
				if(index<=N && i==D[index]) {
					if(k < K)	k++;
					else		boost=V*T;
					index++;
				}//とりあえず保持する
				if(boost==0 && k>0) {
					k--;
					boost=V*T;
				}//加速範囲でないときにんじん使う
				if(boost==0) {
					ans+=1.0/U;
				}//普通のとき
				else {
					ans+=1.0/V;
					boost--;
				}//加速のとき
				
			}
			System.out.println(ans);
			
			

		}
	}
}
