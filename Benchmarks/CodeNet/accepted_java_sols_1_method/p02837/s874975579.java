
import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		int maxNumberOfHonest = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        //claim[i][x_ij] = y_ij 人iは人x_ijがy_ij（正直者1 or 不親切な人0　or　主張なし-1）だと主張している
        int[][] claim = new int[N][N];

        //claimを初期化
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		claim[i][j] = -1;
        	}
        }

        //全員の主張を入力
        for(int i=0; i< N; i++) {
        	A[i] = sc.nextInt();
        	for(int j=0; j<A[i]; j++) {
        		int x_ij = sc.nextInt();
        		int y_ij = sc.nextInt();
        		claim[i][x_ij-1] = y_ij;
        	}
        }

        //2^N通りをbit全探査
        //例：001001であれば、６人の中で３人目と６人目だけが正直者
        //(1<<N) = 2^N
        for(int i=0;i<(1<<N);i++) {
        	int numberOfHonest = 0;

        	//assumptin[j] = 0 or1
        	//人jが正直者or不親切な人と仮定
        	//初期値は全員不親切な人
        	int[] assumption = new int[N];
        	for(int j=0;j<N;j++) {
        		assumption[j] = 0;
        	}

        	//正直者と仮定した人を探す
        	//人数も数えておく
        	for(int j=0;j<N;j++) {
        		if((1 & (i>>j))==1) { //iのjbit目が1かどうか　つまり　人jが正直者かどうか
        			assumption[j] = 1;
        			numberOfHonest ++;
        			}
        	}

        	//正直者の主張が、仮定と矛盾しないかチェックする
        	//矛盾する場合は、ループを続ける
        	//矛盾がなければ、ループを脱出する
        	boolean check = true;
        	for(int j=0;j<N;j++) {
        		if(assumption[j]==1) {
        			for(int k=0;k<N;k++) {
        				if(claim[j][k] == -1) continue;
        				if(claim[j][k] != assumption[k]) check = false;
        			}
        		}
        	}

        	if(check) maxNumberOfHonest = Math.max(numberOfHonest, maxNumberOfHonest);
        }
        
        System.out.println(maxNumberOfHonest);


	}

}






