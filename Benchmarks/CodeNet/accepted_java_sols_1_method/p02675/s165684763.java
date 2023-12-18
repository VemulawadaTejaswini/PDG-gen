import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if(N%10==3) {
			System.out.println("bon");
			}
		if(N%10==0||N%10==1||N%10==6||N%10==8){
			System.out.println("pon");
			}
		if(N%10==2||N%10==4||N%10==5||N%10==7||N%10==9){
			System.out.println("hon");
		}
	}

}