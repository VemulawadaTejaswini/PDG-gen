import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();//よこ

		int M = sc.nextInt();//たて

		int T = sc.nextInt();//折返し回数

		int P = sc.nextInt();//穴

		while(true) {

			if(N==0&&M==0&&P==0&&T==0) break;

			//折り紙の配列a[よこ][たて]
			int[][] a = new int[N*T*2][M*T*2];

			//初期化
			//折り紙部分は1,その他0
			for(int i=0;i<N*T*2;i++) {

				for(int j=0;j<M*T*2;j++) {

					if(i<N && j<M) a[i][j] = 1;

					else a[i][j] = 0;
				}
			}

			int[][] t = new int[T][2];

			for(int i=0;i<T;i++) {

				for(int j=0;j<2;j++) {

					t[i][j] = sc.nextInt();
				}
			}

			int[][] p = new int[P][2];

			for(int i=0;i<P;i++) {

				for(int j=0;j<2;j++) {

					p[i][j] = sc.nextInt();
				}
			}

			//↑ここまでで格納、初期化終了

			//(0,0)を左上にして考える
			int top = 0;	//折り紙の一番上

			int left = 0;//折り紙の一番左

			int count = 0;

			//折る
			while(count<T) {

				int c = t[count][1];

				if(t[count][0] == 1) {	//左から

					//まず上からt[count][1]分だけ0にする
					//次にtop+t[count][1]からt[count][1]分だけ++
					//top更新


					for(int j=0;j<M*T*2;j++) {

						int xx = 0;

						for(int i=left+c;i<left+c+c;i++) {

							a[left+c+c-xx-1][j] += a[left+xx][j];

							xx++;
						}
					}

					for(int i=left;i<left+c;i++) {

						for(int j=0;j<M*T*2;j++) {

							a[i][j] = 0;
						}
					}


					left += c;

				}else if(t[count][0] == 2) {	//上から(下から）

					for(int i=0;i<N*T*2;i++) {

						int xx = 0;

						for(int j=top;j<top+c;j++) {

							a[i][top+c+c-xx-1] += a[i][top+xx];

							xx++;
						}

					}

					for(int i=0;i<N*T*2;i++) {

						for(int j=top;j<top+c;j++) {

							a[i][j] = 0;
						}
					}

					top += c;

				}

				count++;
			}

			//穴をあける
			count = 0;

			int ans = 0;

			while(count<P) {

				int x = p[count][0];

				int y = p[count][1];

				ans = a[left+x][top+y];

				System.out.println(ans);

				count++;
			}

			//System.out.println("ANS"+ans+" N"+N);

			N = sc.nextInt();

			M =sc.nextInt();

			T = sc.nextInt();

			P = sc.nextInt();
		}
	}

}

