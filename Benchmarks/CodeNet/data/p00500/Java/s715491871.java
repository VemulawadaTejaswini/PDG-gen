import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int N=cin.nextInt();
		int[][]p=new int[N][3];
		for(int i=0;i<N;i++){
			for(int j=0;j<3;j++){
				p[i][j]=cin.nextInt();
			}
		}
		int[] ans=new int[N+1];
		for(int i=0;i<3;i++){
			int[] a=new int[101];
			for(int j=0;j<N;j++){
				int num=p[j][i];
				if(a[num]==0){
					a[num]=j+1;
				}
				else{
					a[num]=-100;
				}
			}
			for(int j=0;j<N;j++){
				if(a[p[j][i]]>0){
					ans[j+1]+=p[j][i];
				}
			}
		}
		for(int i=1;i<=N;i++){
			System.out.println(ans[i]);
		}
	}

}