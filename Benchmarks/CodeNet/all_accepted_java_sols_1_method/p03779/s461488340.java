import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int total = 0;

		for(int i = 0;;i++ ){
			total += i;
			if(total >= X){
				System.out.println(i);
				break;
			}
		}
	}

}
