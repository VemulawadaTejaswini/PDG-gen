import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int X = stdin.nextInt();
		
		for(int i=1;i<=X;i++) {
			if(100*i <= X && 105*i >= X) {
				System.out.print("1");
				break;
			}
			if(i==X) {
				System.out.print("0");
			}
		}
	}
}
