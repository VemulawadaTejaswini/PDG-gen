import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String str = scan.next();
			
			if(str.equals("-")) break;
			
			int m = scan.nextInt();
			
			int[] h = new int[m];
			for(int i = 0; i < m; i++) {
				h[i] = scan.nextInt();
			}
			
			StringBuilder str2 = new StringBuilder();
			str2.append(str);
			for(int i = 0; i < m; i++) {
				String str_temp = str2.substring(0, h[i]);
				str2.delete(0, h[i]);
				str2.append(str_temp);
			}
			
			System.out.println(str2);
		}
		
	}

}

