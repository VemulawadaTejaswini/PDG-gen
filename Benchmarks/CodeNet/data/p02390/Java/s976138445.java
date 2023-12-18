import java.util.Scanner;




public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int hour=(int)Math.floor(a/3600);
		a=a-hour*3600;
		int minute=(int)Math.floor(a/60);
		int second=a-minute*60;
		System.out.println(hour+":"+minute+":"+second);
	}
}
