// 作成日 : 2012/11/02
// 作成者 : 01 石川力太

package 電話番号管理３;

import java.io.*;
import java.sql.*;
public class Member3 {

	// Oracle DB 操作用のクラスをインスタンス化
	OracleManager olm;
	BufferedReader br;
	ResultSet rs;

	public Member3 () throws IOException, SQLException {
		olm = new OracleManager();	//DB操作?
		br = new BufferedReader(new InputStreamReader(System.in));
		// データ選択用のSQLを作成
		// ;はSQLでは付けない
		// 検索した結果が ResultSet型のrsに保存される
		menu();
	}

	// メニュー
	public void menu() throws IOException, SQLException {

		int command = 0;   // 使いたい機能の番号

		System.out.println("*** 電話番号管理１プログラム START ***\n");

		do {

			System.out.println("1:登録  2:表示  3:検索  4:削除  0.終了");

			System.out.print("番号を入力してください > ");
			command = Integer.parseInt(br.readLine());

			if (command == 1)
				registData();
			else if (command == 2)
				dataList();
			else if (command == 3)
				searchData();
			else if (command == 4)
				deleteData();
			else if (command == 0)
				System.out.println("プログラムを終了します");
			else
				System.out.println("正しい番号を入力してください");
			if (command != 0) System.out.println();

		} while (command != 0);
	}

	// 登録
	public void registData () throws IOException {
		System.out.println("Oracle DB にデータを登録します。");

		String name,tel;
		int mail;
		try{
				System.out.print("氏名は？");
				name = br.readLine();

				System.out.println();
				System.out.print("電話番号は？");
				tel = br.readLine();

				System.out.println();
				System.out.print("メールは？（あり：１　なし：２）");
				mail = Integer.parseInt(br.readLine());

				System.out.println();

				// Oracle DB 操作準備
				olm.openResouce();					//DB操作?

				//DB操作?
				// データ登録用のSQLを作成
				//;はSQLでは付けない
				olm.updateData("INSERT INTO DB1電話番号表 VALUES((SELECT (MAX(管理番号) + 1) FROM DB1電話番号表),'" + name + "','" + tel + "'," + mail + ")");

				// Oracle DB 操作終了
				olm.closeResouce();					//DB操作?

				System.out.println("正常に登録されました。");


		}catch(IOException e){
			System.out.println("コマンド入力中に入出力エラー発生!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	// 表示
	public void dataList() {
		// Oracle DB 操作準備
		olm.openResouce();							//DB操作?

		rs = olm.getData("SELECT 管理番号,氏名,電話番号,メール FROM DB1電話番号表 ORDER BY 管理番号"); //DB操作?

		// データ表示　処理
		/* getIntは数値型データの取得
		 * getStringは文字型のデータの取得
		 */
		try {
			while(rs.next()){
				System.out.print(rs.getInt("管理番号") + ":" + rs.getString("氏名") + rs.getString("電話番号"));
				System.out.println(rs.getInt("メール") == 1 ? "メールあり" : "メールなし");
			}
													//DB操作?

		} catch (SQLException e) {
			System.out.println("表示処理失敗");
			e.printStackTrace();

		} finally {
			// Oracle DB 操作終了
			olm.closeResouce();						//DB操作?
		}
	}

	// 検索
	public void searchData() throws IOException, SQLException {

		// Oracle DB 操作準備
		olm.openResouce();							//DB操作?

		String name;          		 // 検索する名前

		System.out.println("検索する氏名を入力してください");
		System.out.print("\n氏名は？ --> ");
		name = br.readLine();

		rs = olm.getData("SELECT 管理番号,氏名,電話番号,メール FROM DB1電話番号表 WHERE 氏名 = '" + name + "'"); //DB操作?

		try {
			while(rs.next()){
				System.out.print(rs.getInt("管理番号") + ":" + rs.getString("氏名") + rs.getString("電話番号"));
				System.out.println(rs.getInt("メール") == 1 ? "メールあり" : "メールなし");
			}
													//DB操作?
		} catch (SQLException e) {
			System.out.println("表示処理失敗");
			e.printStackTrace();

		} finally {
			// Oracle DB 操作終了
			olm.closeResouce();						//DB操作?
		}
	}

	// 削除
	public void deleteData () throws IOException, SQLException {

		// Oracle DB 操作準備
		olm.openResouce();							//DB操作?

		String name;          		 // 削除する名前

		System.out.println("削除する氏名を入力してください");
		System.out.print("\n氏名は？ --> ");
		name = br.readLine();

		while (name.length() != 10)
			name += "  ";

		olm.updateData("DELETE FROM DB1電話番号表 WHERE 氏名 = '" + name + "'");

		// Oracle DB 操作終了
		olm.closeResouce();					//DB操作?

		System.out.println("正常に削除されました。");
	}

	public static void main(String[] args) throws IOException, SQLException {

		new Member3(); // コンストラクタの呼び出し

	}
}