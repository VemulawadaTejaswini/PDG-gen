import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] cnt = new int[N];
		int[] count = new int[N];
		int[][] U = new int[N][3];
		for(int i=0; i<N; i++){
			for(int j=0; j<3; j++){
				U[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int l=0; l<N; l++){
				cnt[l]=U[l][i];
			}
			for(int j=0; j<N; j++){
				for(int k=0; k<N; k++){
					if(j!=k){
						if(cnt[j]==U[k][i]){
							U[k][i]=0;
						}
					}
				}
			}
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<3; j++){
				count[i]+=U[i][j];
			}
		}
		for(int i=0; i<N; i++){
			System.out.println(count[i]);
		}
		// TODO Auto-generated method stub

	}

}