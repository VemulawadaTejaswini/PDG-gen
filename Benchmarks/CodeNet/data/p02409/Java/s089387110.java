import java.io.*;
public class Main {
	/**
	 * 公舎の入居者数を出力する
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//校舎の件数
		int n = Integer.parseInt(br.readLine());
		//トランプ全てのの配列
		int[][][] count = new int[4][3][10]; 
		//全ての部屋の人数を0人にする
		for(int i = 0; i < 4; i++){
			for(int l = 0; l < 3; l++){
				for(int k = 0; k < 10; k++){
					count[i][l][k] = 0;
				}//for
			}//for
		}//for
		//各棟、各部屋の人数を配列に入れる
		for(int i = 0; i < n; i++){
			String str  = br.readLine();
			String[] strs = str.split(" ");
			int b = Integer.parseInt(strs[0]) - 1;	//各棟
			int f = Integer.parseInt(strs[1]) - 1;	//階
			int r = Integer.parseInt(strs[2]) - 1;	//何番目
			int v = Integer.parseInt(strs[3]);
			count[b][f][r] += v;
			if(count[b][f][r] > 9){
				count[b][f][r] = 9;
			}else if(count[b][f][r] < 0){
				count[b][f][r] = 0;
			}
		}//for
		//出力
		for(int i = 0; i < 4; i++){
			if(i != 0){
				System.out.println("####################");
			}
			for(int l = 0; l < 3; l++){
				for(int k = 0; k < 10; k++){
					System.out.print(" ");
					System.out.print(count[i][l][k]);
				}//for
				System.out.println();
			}//for
		}//for
	}
}