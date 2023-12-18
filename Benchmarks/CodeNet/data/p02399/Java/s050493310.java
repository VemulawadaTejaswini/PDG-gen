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
	
		int a = num[0];
		int b = num[1];

		int d = a/b;
		int r = a%b;
		float f = (float)a/b;

		System.out.println(d + " " + r + " " + f);
	}
}
