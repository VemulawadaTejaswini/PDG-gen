import java.util.*;

public class Main {
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());//ボタンの数
		int CNT = 1;//入力終了を判定するフラグ
		int i=1;//ボタンi
		int[] NextButton = new int[N+1];//次に光るボタンを格納する配列
		while(CNT <= N){
			NextButton[CNT] = Integer.parseInt(scan.next());
			CNT++;
		}
		scan.close();
		CNT = 1;
		while(true){
			if(CNT > N){//不可能な場合
				System.out.println("-1");
				break;
			}
			if(NextButton[i] == 2){//2だった場合
				System.out.println(CNT);
				break;
			}
			else {
				i = NextButton[i];
			}

			CNT++;
		}
}
}