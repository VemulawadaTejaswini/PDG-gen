import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int hour = num/3600;
		int mum = num%3600/60;
		int sec = num%3600%60;
		System.out.println(hour+":"+mum+":"+sec);

	}
}