import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true){

			//最初の並びを表す文字列
			String str;
			//シャッフル回数
			int m;

			while(true){

				//文字列を-が出てくるまで入力する
				if((str = sc.next()).equals("-")){
					break;
				}

				m = sc.nextInt();
				for(int j = 0,ｈ; j < m; j++)
				{

					ｈ = sc.nextInt();
					str = str.substring(ｈ) + str.substring(0,ｈ);
				}
				System.out.println(str);
			}


		}
	}

}