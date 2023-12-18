import java.io.*;
import java.lang.*;
class Time
{
	public final int SecondToHour = 3600;
	public final int SecondToMinutes = 60;
 
	public String whatTime(int seconds)
	{
		//計算結果(int)等を文字列(String)にて出力する必要がある時は、Integerを使う
		Integer hour = 0;
		Integer minutes = 0;
		Integer second=0;
 
		//出力用の文字列
		String output="";
 
		//3600秒以上の場合
		if(seconds > SecondToHour)
		{
			hour=(int)Math.floor(seconds/SecondToHour);//割り算の整数値が時間(hour)となる
			seconds = seconds%SecondToHour;//計算の為、余りを算出
		}
		else
		{
			hour = 0;
		}
 
		if(seconds > SecondToMinutes)
		{
			minutes=(int)Math.floor(seconds/SecondToMinutes);
			second = seconds%SecondToMinutes;
		}
		else
		{
			minutes = 0;
		}
 
		//出力用の変数を作成
		//hour,minutes,secondはInteger型なので、toString()メソッドにてString型に変換して格納
		//toStringの定義方法は、変数名.toString()と定義する事。
 
		output = hour.toString();
		output += ":";
		output += minutes.toString();
		output += ":";
		output += second.toString();	
 
	return output;
	}
	
	public static void main(String args[])
	{
	Time time = new Time();//main関数にてメソッドを使いたい場合は、オブジェクトを定義
	System.out.println(time.whatTime(0));//Class TimeのメソッドwhatTimeを実行
	}
}