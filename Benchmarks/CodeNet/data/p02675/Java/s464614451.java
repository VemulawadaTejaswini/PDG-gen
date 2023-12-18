import java.util.Scanner;
public class honn {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if(N%10==3) {
			System.out.println("bon");
			}
		if(N%10==0||N%10==1||N%10==6||N%10==8){
			System.out.println("pon");
			}else {
				System.out.println("honn");
			}
	}

}
