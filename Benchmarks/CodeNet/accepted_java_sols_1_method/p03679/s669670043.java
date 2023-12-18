
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int x = Integer.parseInt(scan.next());//賞味期限を X 日まで過ぎた食品を食べてもお腹を壊しません
		int a = Integer.parseInt(scan.next());;//賞味期限の A 日前
		int b = Integer.parseInt(scan.next());;//買ってから B 日後

		if(a < b){//賞味期限または期限を過ぎている
			int Sa = Math.abs(a-b);//期限超過日数
			if(Sa < x+1){//safe
				System.out.println("safe");
			}
			else{//お腹壊した
				System.out.println("dangerous");
			}
		}
		else {
			//期限を過ぎていない
			System.out.println("delicious");
		}
	}

}