import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[][] A = new int[3][3];
		for(int i=0;i<3;i++){
			String W = in.readLine();
			String[] Ws = W.split(" ");
			A[i][0] = Integer.parseInt(Ws[0]);
			A[i][1] = Integer.parseInt(Ws[1]);
			A[i][2] = Integer.parseInt(Ws[2]);
		}

		String W = in.readLine();
		int N = Integer.parseInt(W);

		for(int i=0;i<N;i++){
			W = in.readLine();
			int b = Integer.parseInt(W);

			for(int y=0;y<A.length;y++){
				for(int x=0;x<A[y].length;x++){
					if(A[x][y] == b){
						A[x][y] = -1;
					}
				}
			}
		}
		String ans ="No";
		for(int y=0;y<A.length;y++){
			boolean flg = true;
			for(int x=0;x<A[y].length;x++){
				if(A[x][y] != -1){
					flg=false;
					break;
				}
			}
			if(flg){
				ans="Yes";
			}
		}

		for(int y=0;y<A.length;y++){
			boolean flg = true;
			for(int x=0;x<A[y].length;x++){
				if(A[y][x] != -1){
					flg=false;
					break;
				}
			}
			if(flg){
				ans="Yes";
			}
		}

		if(A[0][0] == -1 && A[1][1] == -1 && A[2][2] == -1 ){
			ans="Yes";
		}

		if(A[2][0] == -1 && A[1][1] == -1 && A[0][2] == -1 ){
			ans="Yes";
		}


		System.out.println(ans);
	}


}
