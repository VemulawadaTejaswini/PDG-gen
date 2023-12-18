
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 出力用変数を用意
		StringBuilder out = new StringBuilder();

		// 入力値がある限りまわす
		while (sc.hasNext()) {

			/**
			 * すべてのビデオを入れるリスト
			 */
			ArrayList<Video> allVideoList = new ArrayList<Video>();

			// 新作、準新作、旧作の料金。セット料金の本数、料金を取得
			int newPrice = sc.nextInt();
			int normalPrice = sc.nextInt();
			int oldPrice = sc.nextInt();
			int setCount = sc.nextInt();
			int setPrice = sc.nextInt();

			// 上記の入力値が０の場合は標準入力を終え、出力へ
			if (newPrice == 0 && normalPrice == 0 && oldPrice == 0
					&& setCount == 0 && setPrice == 0) {
				break;
			}

			// それぞれのビデオの本数を取得
			int newCount = sc.nextInt();
			int normalCount = sc.nextInt();
			int oldCount = sc.nextInt();

			// 入力値に従い、旧作のインスタンスを作る
			for (int obj_count = 0; obj_count < oldCount; obj_count++) {
				Video Video = new Video(oldPrice, "旧作");
				// ビデオのリストに追加
				allVideoList.add(Video);
			}

			// 入力値に従い、準新作のインスタンスを作る
			for (int obj_count = 0; obj_count < normalCount; obj_count++) {
				Video Video = new Video(normalPrice, "準新作");
				// ビデオのリストに追加
				allVideoList.add(Video);
			}

			// 入力値に従い、新作ビデオのインスタンスを作る
			for (int obj_count = 0; obj_count < newCount; obj_count++) {
				Video Video = new Video(newPrice, "新作");
				// ビデオのリストに追加
				allVideoList.add(Video);
			}

			for (int i = 0; i < allVideoList.size(); i++) {
				System.out.println(allVideoList.get(i).getRentalPrice());
			}

			// 最適なセット料金を適用
			Set set = new Set(setPrice, setCount);
			out.append(set.mostDiscountPrice(allVideoList) + "\n");
		}

		// 結果を出力
		System.out.println(out);

	}
}

/** ビデオクラス */
class Video {

	/** 料金 */
	private int rentalPrice = 0;
	/** 状態 */
	private String value = "";

	/**
	 * 
	 * @param 料金
	 *            　price
	 * @param ビデオの種類
	 *            　val
	 */
	Video(int price, String val) {
		rentalPrice = price;
		value = val;
	}

	/**
	 * ゲッター
	 */
	public int getRentalPrice() {
		return rentalPrice;
	}

	public String getValue() {
		return value;
	}

}

/**
 * セットに関するクラス
 * 
 * @author Admin
 * 
 */
class Set {
	/** セット料金 */
	private int setPrice = 0;
	/** セット料金を適用できる最低本数 */
	private int setCount = 0;

	/** 最適な料金を適用した金額 */
	int mostDiscountPrice = 0;

	/**
	 * コンスタラクタ
	 * 
	 * @param セット料金setP
	 * @param セット料金を適用できる最低本数
	 *            setC
	 */
	Set(int setP, int setC) {

		setPrice = setP;
		setCount = setC;

	}

	/**
	 * 借りるビデオのリストから、最適な料金を出す
	 * 
	 * @param すべてのビデオ
	 *            　all
	 * @return 最安値　DiscountPrice
	 */
	public int mostDiscountPrice(ArrayList<Video> all) {
		int useSetPrice = 0;
		int noUseSetPrice = 0;

		// 並んでいるビデオから、セット適用最低本数分をビデオ料金が高い順に取り出し、セット料金を適用した金額と通常の金額を出す。
		for (int i = 0; i < setCount; i++) {

			useSetPrice += setPrice;
			noUseSetPrice += all.get(i).getRentalPrice();
			// System.out.print(all.get(i).getRentalPrice());
		}

		// セット料金を適用した場合としなかった場合を比較
		// セット料金適用のほうが安かった場合
		if (noUseSetPrice > useSetPrice) {

			// 現在セット料金を適用しているビデオを会計金額に追加
			mostDiscountPrice = useSetPrice;

			// セットを適用していないビデオの中で、現在一番料金の高いビデオとセット料金を比較し、ビデオ料金のほうが高い間はセット料金を適用し続ける
			for (int i = setCount; i < all.size(); i++) {
				if (all.get(i).getRentalPrice() >= setPrice) {
					mostDiscountPrice += setPrice;
				} else {
					// セット料金のほうが高くなった場合はビデオ料金を適用
					mostDiscountPrice += all.get(i).getRentalPrice();
				}
			}
		} else {

			// セット料金適用のほうが高かった場合
			// 通常料金を適用
			for (Video video : all) {
				mostDiscountPrice += video.getRentalPrice();
			}
		}

		return mostDiscountPrice;
	}
}