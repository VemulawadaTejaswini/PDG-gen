import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();


		int[] hana = new int[N];

		for(int i = 0; i< N; i++) {
			hana[i] = sc.nextInt();
		}


		int water = 0;

		int max = hana[0];
		int maxnum = 0;
		for(int i = 0; i< N;i++) {

			if(max < hana[i]) {
				maxnum = i;
				max = hana[i];
			}
		}//最大みつけて場所をmaxnumに



		for(;;) {

			int nzmin =  100;
			
			int divCnt = 0;

			for(int i = 0; i< N;i++) {

				if(nzmin > hana[i] && hana[i] > 0) {
					nzmin = hana[i];
				}
			}//0以外の最小値をnzminに
			boolean lastExit =false;
			for(int i = 0; i< N;i++) {
				
				if(!(lastExit) &&hana[i] > 0) {
					divCnt++;
					lastExit = true;
				}
				
				if(hana[i] <= 0) {
					
					lastExit = false;
				}
			}
			
			

			water += (nzmin * divCnt);

			for(int i = 0; i<N;i++) {
				if(hana[i] > 0) {
					hana[i] -= nzmin;
				}
			}//0以外からnzmin(最小値)を引く



			if(hana[maxnum] <= 0) {
				break;
			}
		}
		System.out.println(water);

	}

}
