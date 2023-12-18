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
			int d=V*T;//加速で進む距離
			int L=sc.nextInt();//スタ－トからゴールまでの距離
			int[] D=new int[L+1];//にんじんが置かれている場所
			int[] l=new int[L+1];
			for(int i=1; i<=N; i++) {
				int carrot=sc.nextInt();
				D[carrot]=i;
			}
			double ans=0;
			for(int i=0; i<L; i++) {
				if(l[i]==0 && D[i]==0 && k==0) {
					ans+=1.0/U;
				}
				else if(D[i]>0){
					if(D[i]==1) {
						ans+=1.0/V;
						for(int j=i; j<i+d; j++) {
							l[j]=1;
						}
					}
					else if(l[i]==1 && K>0) {
						k++;
						K--;
						ans+=1.0/V;
					}
					else if(l[i]==1 && K==0) {
						ans+=1.0/V;
						for(int j=i; j<i+d; j++) {
							l[j]=1;
						}
					}
				}
				else if(l[i]==1) {
					ans+=1.0/V;
				}
				else if(k>0) {
					k--;
					K++;
					ans+=1.0/V;
					for(int j=i+1; j<i+d; j++) {
						l[j]=1;
					}
				}
				
			}
			System.out.println(ans);
			
			

		}
	}
}
