import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//スキャナー
		Scanner s = new Scanner(System.in);


		int numx = s.nextInt();
		int numn = s.nextInt();

		if(numn == 0) {

			System.out.println(numx);

			s.close();

			System.exit(0);
		}
		Integer[] array = new Integer[numn];

		for(int i = 0 ; i < numn ; i++) {

			array[i] = s.nextInt();

		}

		//リストへ変換
		List<Integer> listNum = Arrays.asList(array);

		//スキャナーを閉じる
		s.close();

		//answer
		int ans = 0;

		boolean flg_con = true;

		if(! listNum.contains(numx)) {
			//同数が配列にいない場合
			ans = numx;
			
			flg_con = false;
		}

		int count = 0;

		while(flg_con) {

			count++;

			int mnx = numx - count;
			int plx = numx + count;

			if(! listNum.contains(mnx)) {

				ans = mnx;

				flg_con = false;
			}else if (! listNum.contains(plx)) {

				ans = plx;

				flg_con=false;
			}

		}

		System.out.println(ans);
	}

}
