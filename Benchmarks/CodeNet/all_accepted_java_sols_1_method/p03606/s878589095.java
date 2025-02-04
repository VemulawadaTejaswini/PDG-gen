import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] seat = new int[N*2]; 
		int people = 0;
		for (int i = 0; i < seat.length; i++) {
			seat[i] = sc.nextInt();
			if (i % 2 == 1) {
				people = people + seat[i] - seat[i - 1] + 1;
			}
		}
		System.out.println(people);
	}
}