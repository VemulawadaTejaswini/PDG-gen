import java.util.*;

//秒から時間を割り出すプログラム
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int inputInt = Integer.parseInt(input);
		
		int hour = inputInt / 3600;
		inputInt -= hour * 3600;
		int minute = inputInt / 60;
		inputInt -= minute * 60;
		int second = inputInt;
		
		System.out.println(hour + ":" + minute + ":" + second);
		sc.close();
	}
}

