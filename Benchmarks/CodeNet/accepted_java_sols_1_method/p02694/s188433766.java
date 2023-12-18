import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long cnt = 0;
		long mon = 100;
		while(true) {
			if(x <= mon) {
				System.out.println(cnt);
				break;
			}
			mon+=mon/100;
			cnt++;
		}
	}
	
}
