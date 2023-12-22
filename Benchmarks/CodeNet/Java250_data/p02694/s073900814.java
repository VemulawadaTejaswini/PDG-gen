import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		long money = scan.nextLong();
		long year = 0;
		for(long num = 100;num < money;num = num + num/100) {
			year ++;
		}
		System.out.println(year);

		scan.close();
	}
}