import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		char c[] = sc.next().toCharArray();
		for (int i=0;i<3;i++) {
			if (c[i]=='1') {
				count ++;
			}
		}
		System.out.println(count);
	}
}