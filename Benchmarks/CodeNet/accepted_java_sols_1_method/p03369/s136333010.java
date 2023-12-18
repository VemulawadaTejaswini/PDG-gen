import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str=sc.next().split("");
		int price=700;

		for(int i=0;i<3;i++) {
			if(str[i].equals("o")) {
				price+=100;
			}
		}
		System.out.println(price);
	}
}