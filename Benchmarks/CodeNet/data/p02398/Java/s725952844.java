
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[]args) {
		sc = new Scanner(System.in);
		int front = sc.nextInt();
		int back = sc.nextInt();
		int divisor = sc.nextInt();
		while(front < 1 || 10000 < front);
		while(back < 1 || 10000 < back);
		while(divisor < 1 || 10000 < divisor);
		if(front > back) {
			int temp = front;
			front = back;
			back = temp;
		}
		int i;
		int count= 0;
		for(i = front; i <= back; i++) {
			if(divisor % i == 0)
				count++;
		}
		System.out.println(count);
	}
}

