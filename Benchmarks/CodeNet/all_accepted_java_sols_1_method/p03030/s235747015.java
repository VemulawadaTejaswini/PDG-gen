import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String array[][] = new String[num][3];
		for(int i = 0; i < num; i ++) {
			array[i][0] = sc.next();
			array[i][1] = sc.next();
			array[i][2] = String.valueOf(i + 1);
		}
		Arrays.sort(array, (a, b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
		Arrays.sort(array, (a, b) -> a[0].compareTo(b[0]));
		for(int i = 0; i < num; i ++) {
			System.out.println(array[i][2]);
		}
	}
}
