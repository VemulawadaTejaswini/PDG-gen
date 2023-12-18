import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count_t = 0;
		int count_h = 0;
		
		for(int i = 0; i < n; i++) {
			String str_t = scan.next();
			String str_h = scan.next();
			
			if(str_t.compareTo(str_h) < 0) {
				count_h += 3;
			}else if(str_t.compareTo(str_h) > 0) {
				count_t += 3;
			}else {
				count_h++;
				count_t++;
			}
		}
		
		System.out.println(count_t + " " + count_h);
	}

}

