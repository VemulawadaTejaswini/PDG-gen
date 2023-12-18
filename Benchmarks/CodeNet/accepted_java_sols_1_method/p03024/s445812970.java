import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String n = sc.nextLine();
		int count = 0;
		for(String target : n.split("")) {
			if(target.equals("o")) {
				count++;
			}
		}

		int sum = (15 - n.length()) + count;
		if(sum >= 8) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}