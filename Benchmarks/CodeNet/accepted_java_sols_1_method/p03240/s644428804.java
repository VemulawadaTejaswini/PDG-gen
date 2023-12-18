import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] S = new int[N][3];
		for(int i = 0 ; i < N ; i++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
			S[i][2] = sc.nextInt();
		}
		sc.close();

		//入力内の最大高
		int high = 0 ;
		for(int i = 0 ; i < N ; i++){
			high = Math.max(high, S[i][2]);
		}

		int anstmp = 0;
		int count = 0;
		for(int i = 0 ; i <= 100 ; i++){
			for(int j = 0 ; j <= 100 ; j++){
				for(int k = high ; k <= high+200 ; k++){
					for(int l = 0 ; l < N ; l++){
						//頂点が(i,j)に高さkで存在する場合、N個の候補座標はいくつになっているか
						int H = Math.max(k - Math.abs(S[l][0]-i) - Math.abs(S[l][1]-j),0);
						//System.out.println(i + " " + j + " " + k + " " +H);
						if(H == S[l][2]){
							count++;

							if(count==N){
								System.out.println(i + " " + j + " " + k);
							}
							else{
								continue;
							}
						}
						else{
							count = 0;
							break;
						}

					}

				}
			}
		}
	}
}