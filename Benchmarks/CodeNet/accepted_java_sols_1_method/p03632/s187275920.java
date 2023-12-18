import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int one = sc.nextInt();
		int two = sc.nextInt();//B
		int three = sc.nextInt();
		int four = sc.nextInt();

		int min = Math.max(one, three);
		int max = Math.min(two, four);

		if (min < max) {
			System.out.println(max - min);
		} else {
			System.out.println(0);
		}
	}
}
