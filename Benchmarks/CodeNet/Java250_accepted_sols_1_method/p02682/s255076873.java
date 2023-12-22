import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = Integer.parseInt(sc.next());
		int zero = Integer.parseInt(sc.next());
		int min = Integer.parseInt(sc.next());
		int count = Integer.parseInt(sc.next());
		int time = 0;
		if(count==0) {
			System.out.println(0);
		}
		else if(one+zero>=count) {
			if(one>=count) {
			System.out.println(count);}else {
				System.out.println(one);
			}
		}else {
			int mins = count -one-zero;
			System.out.println(one-mins);
		}
}
}
