import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
		while(true) {
			if(a >= 10 ) {
				a = a - 10;
				
			}else {
				break;
			}
			
		}
		if(0 <= a && 10 > a ) {
			String s ;
			if(a == 2 || a == 4 || a == 5 || a == 7 || a == 9) {
				s = "hon";
			}
			else if(a == 0 || a == 1 || a == 6 || a == 8 ) {
				s = "pon";
			}else {
				s = "bon";
		}
			System.out.println(s);
		}
		
		
		

}
}
