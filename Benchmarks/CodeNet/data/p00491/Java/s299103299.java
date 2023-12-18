import java.util.Scanner;
public class Main {
	static int all_day;
	static final int set_data = 10000;
	static long[][] tomato = new long[2][]; 
	static long[][] cream = new long[2][];
	static long[][] basilico = new long[2][];
	
	static void setData(int[][] data, int today) {
		boolean flag = false;
		for(int r = 0; r < data.length; r++) {
			if((data[r][0] - 1) == today) {
				//System.out.println("種類：" + data[r][1] + "今日は" + (today + 1) + "日");
				Type_accumulate(data[r][1], today);
				flag = true;
			}
			if(flag == false && r == data.length - 1) {
				//System.out.println("全体処理かかります。");
				Not_Only_accumulate(today);
			}
		}
	}
	
	static void Not_Only_accumulate(int today) {
		//トマト
		tomato[0][today] = tomato[1][today - 1];
		tomato[1][today] = cream[0][today - 1] + cream[1][today - 1] + basilico[0][today - 1] + basilico[1][today - 1] % set_data;
		//クリーム
		cream[0][today] = cream[1][today - 1];
		cream[1][today] = tomato[0][today - 1] + tomato[1][today - 1] + basilico[0][today - 1] + basilico[1][today - 1] % set_data;
		//バジル
		basilico[0][today] = basilico[1][today - 1];
		basilico[1][today] = tomato[0][today - 1] + tomato[1][today - 1] + cream[0][today - 1] + cream[1][today - 1] % set_data;
	}
	
	static void Type_accumulate(int kind, int today) {
		switch(kind) {
		case 1: //トマトの場合
			tomato[0][today] = tomato[1][today - 1];
			tomato[1][today] = cream[0][today - 1] + cream[1][today - 1] + basilico[0][today - 1] + basilico[1][today - 1] % set_data;
			//System.out.println("トマトのみ処理入りました〜");
			break;
		case 2: //クリームの場合
			cream[0][today] = cream[1][today - 1];
			cream[1][today] = tomato[0][today - 1] + tomato[1][today - 1] + basilico[0][today - 1] + basilico[1][today - 1] % set_data;
			//System.out.println("クリームのみ処理入りました〜");
			break;
		case 3: //バジルの場合
			basilico[0][today] = basilico[1][today - 1];
			basilico[1][today] = tomato[0][today - 1] + tomato[1][today - 1] + cream[0][today - 1] + cream[1][today - 1] % set_data;
			//System.out.println("バジルのみ処理入りました〜");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		all_day = stdIn.nextInt();
		for(int r = 0; r < tomato.length; r++) {
			tomato[r] = new long[all_day];
			cream[r] = new long[all_day];
			basilico[r] = new long[all_day];
		}
		int decided_day = stdIn.nextInt();
		int[][] data = new int[decided_day][2];
		int counter = 0;
		
		for(int r = 0; r < decided_day; r++) { //読み込み
			data[r][0] = stdIn.nextInt(); //day
			data[r][1] = stdIn.nextInt(); //kind
			//System.out.println("DEBUG");
			//System.out.println(r); //日にちDEBUG
			if(counter != 1 && data[r][0] == 1) {
				//System.out.println("テストケースでは一度しか出さないメッセージ");
				//System.out.println("DEBUG1");
				//System.out.println("Array \"tomato\" is accept order before this order.");
				switch(data[r][1]) { //恐らくエラー箇所
				case 1: tomato[1][0] = 1; break;
				case 2: cream[1][0] = 1; break;
				default: basilico[1][0] = 1; break;
				}
				counter++;
			} else if(counter != 1 && r == decided_day - 1){
				//System.out.println("テストケースでは一度しか出さないメッセージ");
				//System.out.println("DEBUG2");
				tomato[1][0] = 1;
				cream[1][0] = 1;
				basilico[1][0] = 1;
				counter++;
			}
		}
		
		
		//System.out.println("DEBUG BEFORE SUBROUTINE");
		for(int r = 1; r < all_day; r++) { //r + 1 = 日にち
			setData(data, r);
		}
		/*for(int r = 0; r < 2; r++) {
			System.out.println("tomato:" + tomato[r][all_day - 2]);
			System.out.println("cream:" + cream[r][all_day - 2]);
			System.out.println("basilico:" + basilico[r][all_day - 2]);
		}*/
		/*for(int r = 0; r < 2; r++) { //全データの確認
			for(int c = 0; c < all_day; c++) {
				System.out.println("tomato:" + tomato[r][c]);
				System.out.println("cream:" + cream[r][c]);
				System.out.println("basilico:" + basilico[r][c]);
			}
			System.out.println();
		}*/
		System.out.println((tomato[0][all_day - 1] + tomato[1][all_day - 1] + cream[0][all_day - 1] + cream[1][all_day - 1] + basilico[0][all_day - 1] + basilico[1][all_day - 1]) % set_data);		
	}
}