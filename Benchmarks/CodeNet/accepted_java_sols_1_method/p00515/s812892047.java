
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		int ave = 0;

		for(int i = 0;i<5;i++) data[i] = sc.nextInt();

		for(int k : data) ave += (k<40)? 40 : k;
		ave /= 5;

		System.out.println(ave);
	}

}