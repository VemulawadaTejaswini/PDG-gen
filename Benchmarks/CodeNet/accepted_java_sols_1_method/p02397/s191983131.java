import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sc = new Scanner(System.in);
		 for(int i = 0 ;; i++) {
			 int x = sc.nextInt();
			 int y = sc.nextInt();
			 if(x == 0 && y == 0) {
				 break;
			 }
			 if(x > y) {
			 System.out.println(y + " " + x);
			 }else {
			 System.out.println(x + " " + y);
			}
		 }
		 sc.close();
	 }
}
