import java.util.*;
public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
			} else if (i % 3 == 0) {

			} else if (i % 5 == 0) {

			} else {
				list.add(i);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println(sum);
	}
}