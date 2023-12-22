
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Integer num=new Scanner(System.in).nextInt();
		int nowNum=1;
		while(nowNum*2<=num) {
			nowNum*=2;
		}
		System.out.println(nowNum);
	}
}