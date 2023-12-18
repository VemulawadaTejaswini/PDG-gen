import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args){

		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(ISR);
		//入力
		try{
			String strTime = BR.readLine();

			//int型に変換
			int intTime = Integer.parseInt(strTime);
			//60秒(1分)で割り切れなかったものが秒
			int intSecond =intTime % 60;
			//3600秒(1時間)の余りで、60秒で切りきれたものが分
			int intMinute = (intTime % 3600)/60;
			//3600(1時間)で割り切れたものが時
			int intHour = intTime / 3600;

			System.out.println(intHour + ":" + intMinute +":" + intSecond);
		}catch(IOException e){
			System.out.println(e);
		}
	}	
}

