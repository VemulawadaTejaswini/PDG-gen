import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブScanner scan = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int X = scan.nextInt();

        int count = 0;

        for(int a = 0; a <= A; a++ ) {
        	for(int b = 0; b <= B; b++) {
        		for(int c = 0; c <= C; c++) {
        			int total = 500 * a + 100 * b + 50 * c;
        			// 合計がxに一致
        			if(total == X) {
        				// 方法をカウント
        				count++;
        			}
        		}
        	}
        }

        System.out.println(count);
	}

}
