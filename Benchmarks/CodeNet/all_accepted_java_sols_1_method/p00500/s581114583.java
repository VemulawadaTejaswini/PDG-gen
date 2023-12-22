import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] game = new int[N][3];
		int[][] flag = new int[N][3];
		int[] tokuten = new int[N];
		for(int i=0; i<N; i++){
			tokuten[i] = 0;
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<3; j++){
				flag[i][j]=0;
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<3; j++){
				game[i][j] = s.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<N; j++){
				for(int k=0; k<N; k++){
					if(j==k) continue;
					if(game[j][i]==game[k][i]){
						flag[j][i]=1;
						flag[k][i]=1;
					}
				}
			}
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<3; j++){
				if(flag[i][j]==0){
					tokuten[i]+= game[i][j];
				}
			}
		}
		for(int i=0; i<N; i++){
			System.out.println(tokuten[i]);
		}
	}
}