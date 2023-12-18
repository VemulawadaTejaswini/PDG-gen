import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input_time = sc.nextInt();
		int loop_time = 0;
		while(input_time != 0) {
			loop_time++;
			System.out.println("Case " + loop_time + ": " + input_time);
			input_time = sc.nextInt();
		}
	}
}

