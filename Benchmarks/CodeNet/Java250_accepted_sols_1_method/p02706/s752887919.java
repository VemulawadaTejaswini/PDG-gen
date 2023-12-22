import java.util.Scanner;
public class Main {
	public static void main(String[] args){

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int natsuyasumi = sc.nextInt();
		int shukudai = sc.nextInt();

//	宿題の数分、宿題やる日を夏休みから引く
		for(int i=0 ; i<shukudai ; i++) {
			int bangou = sc.nextInt();
			natsuyasumi -= bangou;
		}

//	遊べる日数が0日以上かどうか判断
		if(natsuyasumi>=0) {
			System.out.print(natsuyasumi);
		}
		else {
			System.out.print(-1);
		}
	}
}
