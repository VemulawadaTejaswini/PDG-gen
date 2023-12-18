import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] data = str.split(" ");
		int num[] = new int[data.length];
		for(int i = 0; i < data.length; i++){
			num[i] = Integer.parseInt(data[i]);
		}

		int x = num[0];
		int y = num[1];

		if(x >= y) {
			System.out.println(y + " " + x);
		} else {
			System.out.println(x + " " + y);
		}
	}
}
