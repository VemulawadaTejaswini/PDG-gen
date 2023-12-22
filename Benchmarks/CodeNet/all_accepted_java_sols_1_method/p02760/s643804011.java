import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int bingo[] = new int [9];
		boolean flag = false;

		//ビンゴカード作成
		for(int i = 0; i < 9; i++){
			bingo[i] = scan.nextInt();
		}

		//ビンゴカード穴開け
		int N = scan.nextInt();
		for(int k=0; k < N; k++){
			int num = scan.nextInt();
			for(int i=0; i < bingo.length; i ++){
				if(bingo[i] == num) bingo[i] = 0;
			}
		}

		//ビンゴチェック
		for (int i= 0; i <9; i +=3){
			if (bingo[i] == 0 && bingo[i+1] == 0 && bingo[i+2] == 0){
				flag = true;
			}
		}
		for(int i=0; i < 3; i ++){
			if (bingo[i] == 0 && bingo[i+3] == 0 && bingo[i+6] == 0){
				flag = true;
			}
		}
		if(bingo[0] == 0 && bingo[4] == 0 && bingo[8] == 0){
			flag = true;
		}
		if(bingo[2] == 0 && bingo[4] == 0 && bingo[6] == 0){
			flag = true;
		}

		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}