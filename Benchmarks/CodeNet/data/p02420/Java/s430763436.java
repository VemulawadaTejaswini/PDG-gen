import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//アルファベットのデータセットn

		//String nsh = "";

		//ループ
		while (true) {
			String n = sc.next();
			//区切り部分

			//-が来たら終了する
			if (n.equals("-")) {
				break;
			}

			//シャッフル回数m
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				//hが数字かそうでないかで判定
				//				try {
				//					Integer.parseInt(h);
				//				} catch (NumberFormatException e) {
				//					System.out.println(n);
				//					n = h;
				//					continue;
				//				}

				//カット位置h
				String h = sc.next();

				//残す部分nFront
				String nf = n.substring(Integer.parseInt(h));

				//hまでを抜き出して後ろに接続するnRear
				String nr = n.substring(0, Integer.parseInt(h));

				//シャッフル後nShuffle
				n = nf + nr;
				//System.out.println(n);
			}

			System.out.println(n);
		}
		sc.close();
	}

}
