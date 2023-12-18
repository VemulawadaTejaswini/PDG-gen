import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		if(N<100 && N>=10) {
			N = N%10;
		}else if(N>=100){
			N = N%100%10;
		}

		switch(N){
			case 2:
			case 4:
			case 5:
			case 7:
			case 9:
				System.out.print("hon");
				break;
			case 0:
			case 1:
			case 6:
			case 8:
				System.out.print("pon");
				break;
			case 3:
				System.out.print("bon");
				break;

		}
	}

}
