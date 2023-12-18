import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();


		//???????????????
		int hour = second / 3600;

		//????????????
		int minute = (second % 3600) / 60;

		//?§??????????
		second = ((second % 3600) / 60);

		System.out.println(hour + ":" + minute + ":" + second);
	}
}